package typings.connectLivereload

import typings.connect.mod.HandleFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-livereload", JSImport.Namespace)
  @js.native
  def apply(): HandleFunction = js.native
  @JSImport("connect-livereload", JSImport.Namespace)
  @js.native
  def apply(options: Options): HandleFunction = js.native
  
  type FileMatcher = String | RegExp
  
  @js.native
  trait Options extends StObject {
    
    var disableCompression: js.UndefOr[Boolean] = js.native
    
    var excludeList: js.UndefOr[js.Array[FileMatcher]] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[js.Function1[/* val */ String, Boolean]] = js.native
    
    var ignore: js.UndefOr[js.Array[FileMatcher]] = js.native
    
    var include: js.UndefOr[js.Array[FileMatcher]] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableCompression(value: Boolean): Self = StObject.set(x, "disableCompression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCompressionUndefined: Self = StObject.set(x, "disableCompression", js.undefined)
      
      @scala.inline
      def setExcludeList(value: js.Array[FileMatcher]): Self = StObject.set(x, "excludeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeListUndefined: Self = StObject.set(x, "excludeList", js.undefined)
      
      @scala.inline
      def setExcludeListVarargs(value: FileMatcher*): Self = StObject.set(x, "excludeList", js.Array(value :_*))
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHtml(value: /* val */ String => Boolean): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[FileMatcher]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: FileMatcher*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[FileMatcher]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: FileMatcher*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait Rule extends StObject {
    
    def fn(w: String, s: String): String = js.native
    
    var `match`: RegExp = js.native
  }
  object Rule {
    
    @scala.inline
    def apply(fn: (String, String) => String, `match`: RegExp): Rule = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction2(fn))
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFn(value: (String, String) => String): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    }
  }
}
