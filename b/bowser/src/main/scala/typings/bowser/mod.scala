package typings.bowser

import org.scalablytyped.runtime.StringDictionary
import typings.bowser.mod.Parser.ParsedResult
import typings.bowser.mod.Parser.Parser
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Constants exposed via bowser getters
    */
  @JSImport("bowser", "BROWSER_MAP")
  @js.native
  val BROWSER_MAP: Record[String, String] = js.native
  
  @JSImport("bowser", "ENGINE_MAP")
  @js.native
  val ENGINE_MAP: Record[String, String] = js.native
  
  @JSImport("bowser", "OS_MAP")
  @js.native
  val OS_MAP: Record[String, String] = js.native
  
  @JSImport("bowser", "PLATFORMS_MAP")
  @js.native
  val PLATFORMS_MAP: Record[String, String] = js.native
  
  /**
    * Creates a Parser instance
    * @param {string} UA - User agent string
    * @param {boolean} skipParsing
    */
  @JSImport("bowser", "getParser")
  @js.native
  def getParser(UA: String): Parser = js.native
  @JSImport("bowser", "getParser")
  @js.native
  def getParser(UA: String, skipParsing: Boolean): Parser = js.native
  
  /**
    * Creates a Parser instance and runs Parser.getResult immediately
    * @param UA - User agent string
    * @returns {Parser.ParsedResult}
    */
  @JSImport("bowser", "parse")
  @js.native
  def parse(UA: String): ParsedResult = js.native
  
  object Parser {
    
    type BrowserDetails = Details
    
    @js.native
    trait Details extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[String] = js.native
    }
    object Details {
      
      @scala.inline
      def apply(): Details = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Details]
      }
      
      @scala.inline
      implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    type EngineDetails = Details
    
    @js.native
    trait OSDetails extends Details {
      
      var versionName: js.UndefOr[String] = js.native
    }
    object OSDetails {
      
      @scala.inline
      def apply(): OSDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OSDetails]
      }
      
      @scala.inline
      implicit class OSDetailsMutableBuilder[Self <: OSDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
      }
    }
    
    @js.native
    trait ParsedResult extends StObject {
      
      var browser: BrowserDetails = js.native
      
      var engine: EngineDetails = js.native
      
      var os: OSDetails = js.native
      
      var platform: PlatformDetails = js.native
    }
    object ParsedResult {
      
      @scala.inline
      def apply(browser: BrowserDetails, engine: EngineDetails, os: OSDetails, platform: PlatformDetails): ParsedResult = {
        val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParsedResult]
      }
      
      @scala.inline
      implicit class ParsedResultMutableBuilder[Self <: ParsedResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrowser(value: BrowserDetails): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEngine(value: EngineDetails): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOs(value: OSDetails): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlatform(value: PlatformDetails): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Parser extends StObject {
      
      /**
        * Get parsed browser object
        * @return {BrowserDetails} Browser's details
        */
      def getBrowser(): BrowserDetails = js.native
      
      /**
        * Get browser's name
        * @param {Boolean} [toLowerCase] return lower-cased value
        * @return {String} Browser's name or an empty string
        */
      def getBrowserName(): String = js.native
      def getBrowserName(toLowerCase: Boolean): String = js.native
      
      /**
        * Get browser's version
        * @return {String} version of browser
        */
      def getBrowserVersion(): String = js.native
      
      /**
        * Get parsed engine
        * @returns {EngineDetails}
        */
      def getEngine(): EngineDetails = js.native
      
      /**
        * Get parsed engine's name
        * @returns {String} Engine's name or an empty string
        */
      def getEngineName(): String = js.native
      
      /**
        * Get OS
        * @return {OSDetails} - OS Details
        *
        * @example
        * this.getOS(); // {
        * //   name: 'macOS',
        * //   version: '10.11.12',
        * // }
        */
      def getOS(): OSDetails = js.native
      
      /**
        * Get OS name
        * @param {Boolean} [toLowerCase] return lower-cased value
        * @return {String} name of the OS — macOS, Windows, Linux, etc.
        */
      def getOSName(): String = js.native
      def getOSName(toLowerCase: Boolean): String = js.native
      
      /**
        * Get OS version
        * @return {String} full version with dots ('10.11.12', '5.6', etc)
        */
      def getOSVersion(): String = js.native
      
      /**
        * Get parsed platform
        * @returns {PlatformDetails}
        */
      def getPlatform(): PlatformDetails = js.native
      
      /**
        * Get platform name
        * @param {boolean} toLowerCase
        */
      def getPlatformType(): String = js.native
      def getPlatformType(toLowerCase: Boolean): String = js.native
      
      /**
        * Get parsed result
        * @return {ParsedResult}
        */
      def getResult(): ParsedResult = js.native
      
      /**
        * Get UserAgent string of current Parser instance
        * @return {String} User-Agent String of the current <Parser> object
        */
      def getUA(): String = js.native
      
      /**
        * Is anything? Check if the browser is called "anything",
        * the OS called "anything" or the platform called "anything"
        * @param {String} anything
        * @returns {Boolean}
        */
      def is(anything: js.Any): Boolean = js.native
      
      /**
        * Check if the browser name equals the passed string
        * @param browserName The string to compare with the browser name
        * @param [includingAlias=false] The flag showing whether alias will be included into comparison
        * @returns {boolean}
        */
      def isBrowser(browserName: String): Boolean = js.native
      def isBrowser(browserName: String, includingAlias: Boolean): Boolean = js.native
      
      /**
        * Parse full information about the browser
        * @returns {Parser.Parser}
        */
      def parse(): typings.bowser.mod.Parser.Parser = js.native
      
      /**
        * Get parsed browser object
        * @returns {BrowserDetails}
        */
      def parseBrowser(): BrowserDetails = js.native
      
      /**
        * Get parsed engine
        * @returns {EngineDetails}
        */
      def parseEngine(): EngineDetails = js.native
      
      /**
        * Parse OS and save it to this.parsedResult.os
        * @returns {OSDetails}
        */
      def parseOS(): OSDetails = js.native
      
      /**
        * Get parsed platform
        * @returns {PlatformDetails}
        */
      def parsePlatform(): PlatformDetails = js.native
      
      /**
        * Check if parsed browser matches certain conditions
        *
        * @param {checkTree} checkTree It's one or two layered object,
        * which can include a platform or an OS on the first layer
        * and should have browsers specs on the bottom-laying layer
        *
        * @returns {Boolean|undefined} Whether the browser satisfies the set conditions or not.
        * Returns `undefined` when the browser is no described in the checkTree object.
        *
        * @example
        * const browser = new Bowser(UA);
        * if (browser.check({chrome: '>118.01.1322' }))
        * // or with os
        * if (browser.check({windows: { chrome: '>118.01.1322' } }))
        * // or with platforms
        * if (browser.check({desktop: { chrome: '>118.01.1322' } }))
        */
      def satisfies(checkTree: checkTree): js.UndefOr[Boolean] = js.native
      
      /**
        * Check if any of the given values satifies `.is(anything)`
        * @param {string[]} anythings
        * @returns {boolean} true if at least one condition is satisfied, false otherwise.
        */
      def some(anythings: js.Array[String]): js.UndefOr[Boolean] = js.native
      
      /**
        * Test a UA string for a regexp
        * @param regex
        * @returns {boolean} true if the regex matches the UA, false otherwise.
        */
      def test(regex: RegExp): Boolean = js.native
    }
    
    @js.native
    trait PlatformDetails extends StObject {
      
      var model: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var vendor: js.UndefOr[String] = js.native
    }
    object PlatformDetails {
      
      @scala.inline
      def apply(): PlatformDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PlatformDetails]
      }
      
      @scala.inline
      implicit class PlatformDetailsMutableBuilder[Self <: PlatformDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
      }
    }
    
    type checkTree = StringDictionary[js.Any]
  }
}
