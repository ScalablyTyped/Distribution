package typings.connectHistoryApiFallback

import typings.connectHistoryApiFallback.connectHistoryApiFallbackBooleans.`true`
import typings.expressServeStaticCore.mod.RequestHandler
import typings.node.urlMod.Url
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  inline def apply(options: Options): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("connect-history-api-fallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Context extends StObject {
    
    val `match`: RegExpMatchArray
    
    val parsedUrl: Url
  }
  object Context {
    
    inline def apply(`match`: RegExpMatchArray, parsedUrl: Url): Context = {
      val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setMatch(value: RegExpMatchArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    val disableDotRule: js.UndefOr[`true`] = js.undefined
    
    val htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    val index: js.UndefOr[String] = js.undefined
    
    val logger: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    val rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
    
    val verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDisableDotRule(value: `true`): Self = StObject.set(x, "disableDotRule", value.asInstanceOf[js.Any])
      
      inline def setDisableDotRuleUndefined: Self = StObject.set(x, "disableDotRule", js.undefined)
      
      inline def setHtmlAcceptHeaders(value: js.Array[String]): Self = StObject.set(x, "htmlAcceptHeaders", value.asInstanceOf[js.Any])
      
      inline def setHtmlAcceptHeadersUndefined: Self = StObject.set(x, "htmlAcceptHeaders", js.undefined)
      
      inline def setHtmlAcceptHeadersVarargs(value: String*): Self = StObject.set(x, "htmlAcceptHeaders", js.Array(value*))
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLogger(value: /* repeated */ Any => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      inline def setRewritesUndefined: Self = StObject.set(x, "rewrites", js.undefined)
      
      inline def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value*))
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Rewrite extends StObject {
    
    val from: js.RegExp
    
    val to: String | js.RegExp | RewriteTo
  }
  object Rewrite {
    
    inline def apply(from: js.RegExp, to: String | js.RegExp | RewriteTo): Rewrite = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rewrite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rewrite] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: js.RegExp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String | js.RegExp | RewriteTo): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToFunction1(value: /* context */ Context => String): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  type RewriteTo = js.Function1[/* context */ Context, String]
}
