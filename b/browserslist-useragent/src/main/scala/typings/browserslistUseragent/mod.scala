package typings.browserslistUseragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browserslist-useragent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def matchesUA(uaString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesUA")(uaString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def matchesUA(uaString: String, opts: BrowserslistUseragentOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesUA")(uaString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def normalizeQuery(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def resolveUserAgent(uaString: String): ResolvedUserAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgent")(uaString.asInstanceOf[js.Any]).asInstanceOf[ResolvedUserAgent]
  
  trait BrowserslistUseragentOptions extends StObject {
    
    var allowHigherVersions: js.UndefOr[Boolean] = js.undefined
    
    var browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var ignoreMinor: js.UndefOr[Boolean] = js.undefined
    
    var ignorePatch: js.UndefOr[Boolean] = js.undefined
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
  
  trait ResolvedUserAgent extends StObject {
    
    var family: String
    
    var version: String
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
