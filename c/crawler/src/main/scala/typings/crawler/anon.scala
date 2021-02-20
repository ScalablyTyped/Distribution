package typings.crawler

import typings.crawler.mod.CrawlerRequestOptions
import typings.crawler.mod.CrawlerRequestResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Log extends StObject {
    
    def log(level: String, args: js.Any*): Unit = js.native
  }
  object Log {
    
    @scala.inline
    def apply(log: (String, /* repeated */ js.Any) => Unit): Log = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log))
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined std.Omit<crawler.crawler.CrawlerRequestOptions, 'callback'> & {callback (error : std.Error, response : crawler.crawler.CrawlerRequestResponse): void} */
  @js.native
  trait OmitCrawlerRequestOptions extends StObject {
    
    def callback(error: Error, response: CrawlerRequestResponse): Unit = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[String] = js.native
    
    var jQuery: js.UndefOr[js.Any] = js.native
    
    var jquery: js.UndefOr[js.Any] = js.native
    
    var limiter: js.UndefOr[String] = js.native
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ CrawlerRequestOptions, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
      ] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var proxies: js.UndefOr[js.Array[_]] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object OmitCrawlerRequestOptions {
    
    @scala.inline
    def apply(callback: (Error, CrawlerRequestResponse) => Unit): OmitCrawlerRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback))
      __obj.asInstanceOf[OmitCrawlerRequestOptions]
    }
    
    @scala.inline
    implicit class OmitCrawlerRequestOptionsMutableBuilder[Self <: OmitCrawlerRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (Error, CrawlerRequestResponse) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setJQuery(value: js.Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJQueryUndefined: Self = StObject.set(x, "jQuery", js.undefined)
      
      @scala.inline
      def setLimiter(value: String): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
      
      @scala.inline
      def setPreRequest(
        value: (/* options */ CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
      ): Self = StObject.set(x, "preRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreRequestUndefined: Self = StObject.set(x, "preRequest", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setProxies(value: js.Array[_]): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxiesUndefined: Self = StObject.set(x, "proxies", js.undefined)
      
      @scala.inline
      def setProxiesVarargs(value: js.Any*): Self = StObject.set(x, "proxies", js.Array(value :_*))
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
