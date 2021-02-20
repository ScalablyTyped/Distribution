package typings.browserslistUseragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browserslist-useragent", "matchesUA")
  @js.native
  def matchesUA(uaString: String): Boolean = js.native
  @JSImport("browserslist-useragent", "matchesUA")
  @js.native
  def matchesUA(uaString: String, opts: BrowserslistUseragentOptions): Boolean = js.native
  
  @JSImport("browserslist-useragent", "normalizeQuery")
  @js.native
  def normalizeQuery(query: String): String = js.native
  
  @JSImport("browserslist-useragent", "resolveUserAgent")
  @js.native
  def resolveUserAgent(uaString: String): ResolvedUserAgent = js.native
  
  @js.native
  trait BrowserslistUseragentOptions extends StObject {
    
    var allowHigherVersions: js.UndefOr[Boolean] = js.native
    
    var browsers: js.UndefOr[js.Array[String]] = js.native
    
    var env: js.UndefOr[String] = js.native
    
    var ignoreMinor: js.UndefOr[Boolean] = js.native
    
    var ignorePatch: js.UndefOr[Boolean] = js.native
  }
  object BrowserslistUseragentOptions {
    
    @scala.inline
    def apply(): BrowserslistUseragentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserslistUseragentOptions]
    }
    
    @scala.inline
    implicit class BrowserslistUseragentOptionsMutableBuilder[Self <: BrowserslistUseragentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHigherVersions(value: Boolean): Self = StObject.set(x, "allowHigherVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHigherVersionsUndefined: Self = StObject.set(x, "allowHigherVersions", js.undefined)
      
      @scala.inline
      def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      @scala.inline
      def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setIgnoreMinor(value: Boolean): Self = StObject.set(x, "ignoreMinor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMinorUndefined: Self = StObject.set(x, "ignoreMinor", js.undefined)
      
      @scala.inline
      def setIgnorePatch(value: Boolean): Self = StObject.set(x, "ignorePatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePatchUndefined: Self = StObject.set(x, "ignorePatch", js.undefined)
    }
  }
  
  @js.native
  trait ResolvedUserAgent extends StObject {
    
    var family: String = js.native
    
    var version: String = js.native
  }
  object ResolvedUserAgent {
    
    @scala.inline
    def apply(family: String, version: String): ResolvedUserAgent = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedUserAgent]
    }
    
    @scala.inline
    implicit class ResolvedUserAgentMutableBuilder[Self <: ResolvedUserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
