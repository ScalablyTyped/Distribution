package typings.bowser.mod.Parser

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  /**
    * Get parsed browser object
    * @return {BrowserDetails} Browser's details
    */
  def getBrowser(): BrowserDetails = js.native
  /**
    * Get browser's name
    * @return {String} Browser's name or an empty string
    */
  def getBrowserName(): String = js.native
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
    * Parse full information about the browser
    */
  def parse(): Unit = js.native
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

