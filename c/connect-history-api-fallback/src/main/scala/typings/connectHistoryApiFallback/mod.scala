package typings.connectHistoryApiFallback

import typings.connectHistoryApiFallback.connectHistoryApiFallbackBooleans.`true`
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.node.urlMod.Url
import typings.qs.mod.ParsedQs
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-history-api-fallback", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("connect-history-api-fallback", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  @js.native
  trait Context extends StObject {
    
    var `match`: RegExpMatchArray = js.native
    
    var parsedUrl: Url = js.native
  }
  object Context {
    
    @scala.inline
    def apply(`match`: RegExpMatchArray, parsedUrl: Url): Context = {
      val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: RegExpMatchArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var disableDotRule: js.UndefOr[`true`] = js.native
    
    var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var index: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var rewrites: js.UndefOr[js.Array[Rewrite]] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setDisableDotRule(value: `true`): Self = StObject.set(x, "disableDotRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDotRuleUndefined: Self = StObject.set(x, "disableDotRule", js.undefined)
      
      @scala.inline
      def setHtmlAcceptHeaders(value: js.Array[String]): Self = StObject.set(x, "htmlAcceptHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAcceptHeadersUndefined: Self = StObject.set(x, "htmlAcceptHeaders", js.undefined)
      
      @scala.inline
      def setHtmlAcceptHeadersVarargs(value: String*): Self = StObject.set(x, "htmlAcceptHeaders", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLogger(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      @scala.inline
      def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait Rewrite extends StObject {
    
    var from: RegExp = js.native
    
    var to: String | RegExp | RewriteTo = js.native
  }
  object Rewrite {
    
    @scala.inline
    def apply(from: RegExp, to: String | RegExp | RewriteTo): Rewrite = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rewrite]
    }
    
    @scala.inline
    implicit class RewriteMutableBuilder[Self <: Rewrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: RegExp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String | RegExp | RewriteTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFunction1(value: /* context */ Context => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  type RewriteTo = js.Function1[/* context */ Context, String]
}
