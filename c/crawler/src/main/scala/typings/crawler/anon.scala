package typings.crawler

import typings.crawler.mod.CrawlerRequestOptions
import typings.crawler.mod.CrawlerRequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Log extends StObject {
    
    def log(level: String, args: Any*): Unit
  }
  object Log {
    
    inline def apply(log: (String, /* repeated */ Any) => Unit): Log = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      inline def setLog(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined std.Omit<crawler.crawler.CrawlerRequestOptions, 'callback'> & {callback (error : std.Error, response : crawler.crawler.CrawlerRequestResponse): void} */
  trait OmitCrawlerRequestOptions extends StObject {
    
    def callback(error: js.Error, response: CrawlerRequestResponse): Unit
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var jQuery: js.UndefOr[Any] = js.undefined
    
    var jquery: js.UndefOr[Any] = js.undefined
    
    var limiter: js.UndefOr[String] = js.undefined
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ CrawlerRequestOptions, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var proxies: js.UndefOr[js.Array[Any]] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object OmitCrawlerRequestOptions {
    
    inline def apply(callback: (js.Error, CrawlerRequestResponse) => Unit): OmitCrawlerRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
      __obj.asInstanceOf[OmitCrawlerRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCrawlerRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (js.Error, CrawlerRequestResponse) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJQuery(value: Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      inline def setJQueryUndefined: Self = StObject.set(x, "jQuery", js.undefined)
      
      inline def setLimiter(value: String): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
      
      inline def setPreRequest(
        value: (/* options */ CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "preRequest", js.Any.fromFunction2(value))
      
      inline def setPreRequestUndefined: Self = StObject.set(x, "preRequest", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProxies(value: js.Array[Any]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
      
      inline def setProxiesUndefined: Self = StObject.set(x, "proxies", js.undefined)
      
      inline def setProxiesVarargs(value: Any*): Self = StObject.set(x, "proxies", js.Array(value*))
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
