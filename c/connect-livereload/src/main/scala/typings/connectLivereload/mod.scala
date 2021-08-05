package typings.connectLivereload

import typings.connect.mod.HandleFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): HandleFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HandleFunction]
  inline def apply(options: Options): HandleFunction = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[HandleFunction]
  
  @JSImport("connect-livereload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FileMatcher = String | RegExp
  
  trait Options extends StObject {
    
    var disableCompression: js.UndefOr[Boolean] = js.undefined
    
    var excludeList: js.UndefOr[js.Array[FileMatcher]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[js.Function1[/* val */ String, Boolean]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[FileMatcher]] = js.undefined
    
    var include: js.UndefOr[js.Array[FileMatcher]] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisableCompression(value: Boolean): Self = StObject.set(x, "disableCompression", value.asInstanceOf[js.Any])
      
      inline def setDisableCompressionUndefined: Self = StObject.set(x, "disableCompression", js.undefined)
      
      inline def setExcludeList(value: js.Array[FileMatcher]): Self = StObject.set(x, "excludeList", value.asInstanceOf[js.Any])
      
      inline def setExcludeListUndefined: Self = StObject.set(x, "excludeList", js.undefined)
      
      inline def setExcludeListVarargs(value: FileMatcher*): Self = StObject.set(x, "excludeList", js.Array(value :_*))
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHtml(value: /* val */ String => Boolean): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIgnore(value: js.Array[FileMatcher]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: FileMatcher*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[FileMatcher]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: FileMatcher*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait Rule extends StObject {
    
    def fn(w: String, s: String): String
    
    var `match`: RegExp
  }
  object Rule {
    
    inline def apply(fn: (String, String) => String, `match`: RegExp): Rule = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setFn(value: (String, String) => String): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
}
