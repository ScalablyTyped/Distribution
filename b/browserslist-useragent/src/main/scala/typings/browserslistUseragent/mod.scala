package typings.browserslistUseragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("browserslist-useragent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchesUA(uaString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesUA")(uaString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchesUA(uaString: String, opts: BrowserslistUseragentOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesUA")(uaString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeQuery(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveUserAgent(uaString: String): ResolvedUserAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgent")(uaString.asInstanceOf[js.Any]).asInstanceOf[ResolvedUserAgent]
  
  trait BrowserslistUseragentOptions extends StObject {
    
    var allowHigherVersions: js.UndefOr[Boolean] = js.undefined
    
    var browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var ignoreMinor: js.UndefOr[Boolean] = js.undefined
    
    var ignorePatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default process.cwd()
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object BrowserslistUseragentOptions {
    
    inline def apply(): BrowserslistUseragentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserslistUseragentOptions]
    }
    
    extension [Self <: BrowserslistUseragentOptions](x: Self) {
      
      inline def setAllowHigherVersions(value: Boolean): Self = StObject.set(x, "allowHigherVersions", value.asInstanceOf[js.Any])
      
      inline def setAllowHigherVersionsUndefined: Self = StObject.set(x, "allowHigherVersions", js.undefined)
      
      inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setIgnoreMinor(value: Boolean): Self = StObject.set(x, "ignoreMinor", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMinorUndefined: Self = StObject.set(x, "ignoreMinor", js.undefined)
      
      inline def setIgnorePatch(value: Boolean): Self = StObject.set(x, "ignorePatch", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatchUndefined: Self = StObject.set(x, "ignorePatch", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ResolvedUserAgent extends StObject {
    
    var family: String
    
    var version: String
  }
  object ResolvedUserAgent {
    
    inline def apply(family: String, version: String): ResolvedUserAgent = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedUserAgent]
    }
    
    extension [Self <: ResolvedUserAgent](x: Self) {
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
