package typings.crawler

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.cheerio.Cheerio
import typings.cheerio.cheerio.CheerioAPI
import typings.cheerio.cheerio.Element
import typings.crawler.anon.Log
import typings.crawler.anon.OmitCrawlerRequestOptions
import typings.crawler.crawlerBooleans.`false`
import typings.crawler.crawlerStrings.drain
import typings.crawler.crawlerStrings.limiterChange
import typings.crawler.crawlerStrings.request
import typings.crawler.crawlerStrings.schedule
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.urlMod.Url
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crawler", JSImport.Namespace)
  @js.native
  class ^ protected () extends Crawler {
    def this(options: CreateCrawlerOptions) = this()
  }
  
  @js.native
  trait Crawler extends EventEmitter {
    
    def direct(options: OmitCrawlerRequestOptions): Unit = js.native
    
    @JSName("on")
    def on_drain(channel: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_limiterChange(
      channel: limiterChange,
      listener: js.Function2[/* options */ CrawlerRequestOptions, /* limiter */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_request(channel: request, listener: js.Function1[/* options */ CrawlerRequestOptions, Unit]): this.type = js.native
    @JSName("on")
    def on_schedule(channel: schedule, listener: js.Function1[/* options */ CrawlerRequestOptions, Unit]): this.type = js.native
    
    def queue(urisOrOptions: String): Unit = js.native
    def queue(urisOrOptions: js.Array[CrawlerRequestOptions | String]): Unit = js.native
    def queue(urisOrOptions: CrawlerRequestOptions): Unit = js.native
    
    val queueSize: Double = js.native
    
    def setLimiterProperty(limiter: String): Unit = js.native
    def setLimiterProperty(limiter: String, property: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
    def setLimiterProperty(limiter: String, property: String): Unit = js.native
    def setLimiterProperty(limiter: String, property: String, value: js.Any): Unit = js.native
  }
  
  @js.native
  trait CrawlerRequestOptions
    extends /* x */ StringDictionary[js.Any] {
    
    var callback: js.UndefOr[
        js.Function3[/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit], Unit]
      ] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[String] = js.native
    
    var jQuery: js.UndefOr[js.Any] = js.native
    
    var jquery: js.UndefOr[js.Any] = js.native
    
    var limiter: js.UndefOr[String] = js.native
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
      ] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var proxies: js.UndefOr[js.Array[_]] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object CrawlerRequestOptions {
    
    @scala.inline
    def apply(): CrawlerRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrawlerRequestOptions]
    }
    
    @scala.inline
    implicit class CrawlerRequestOptionsMutableBuilder[Self <: CrawlerRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
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
        value: (CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
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
  
  @js.native
  trait CrawlerRequestResponse
    extends /* x */ StringDictionary[js.Any] {
    
    @JSName("$")
    def $(selector: String): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: String): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: String, root: String): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: js.Array[Element]): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: js.Array[Element], root: String): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: Cheerio): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: Cheerio, root: String): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: Element): Cheerio = js.native
    @JSName("$")
    def $(selector: String, context: Element, root: String): Cheerio = js.native
    @JSName("$")
    def $(selector: js.Any): Cheerio = js.native
    @JSName("$")
    var $_Original: CheerioAPI = js.native
    
    var body: Buffer | String = js.native
    
    var options: CrawlerRequestOptions = js.native
    
    var request: RequestAsJSON = js.native
  }
  
  @js.native
  trait CreateCrawlerOptions
    extends /* x */ StringDictionary[js.Any] {
    
    var autoWindowClose: js.UndefOr[Boolean] = js.native
    
    var callback: js.UndefOr[
        js.Function3[/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit], Unit]
      ] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var forceUTF8: js.UndefOr[Boolean] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var homogeneous: js.UndefOr[Boolean] = js.native
    
    var incomingEncoding: js.UndefOr[String] = js.native
    
    var jQuery: js.UndefOr[js.Any] = js.native
    
    var jquery: js.UndefOr[js.Any] = js.native
    
    var logger: js.UndefOr[Log] = js.native
    
    var maxConnections: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ CrawlerRequestOptions, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
          Unit
        ]
      ] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var priorityRange: js.UndefOr[Double] = js.native
    
    var rateLimit: js.UndefOr[Double] = js.native
    
    var referer: js.UndefOr[`false` | String] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var retryTimeout: js.UndefOr[Double] = js.native
    
    var rotateUA: js.UndefOr[Boolean] = js.native
    
    var seenreq: js.UndefOr[js.Any] = js.native
    
    var skipDuplicates: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var userAgent: js.UndefOr[String | js.Array[String]] = js.native
  }
  object CreateCrawlerOptions {
    
    @scala.inline
    def apply(): CreateCrawlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCrawlerOptions]
    }
    
    @scala.inline
    implicit class CreateCrawlerOptionsMutableBuilder[Self <: CreateCrawlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoWindowClose(value: Boolean): Self = StObject.set(x, "autoWindowClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoWindowCloseUndefined: Self = StObject.set(x, "autoWindowClose", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setForceUTF8(value: Boolean): Self = StObject.set(x, "forceUTF8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUTF8Undefined: Self = StObject.set(x, "forceUTF8", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHomogeneous(value: Boolean): Self = StObject.set(x, "homogeneous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomogeneousUndefined: Self = StObject.set(x, "homogeneous", js.undefined)
      
      @scala.inline
      def setIncomingEncoding(value: String): Self = StObject.set(x, "incomingEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingEncodingUndefined: Self = StObject.set(x, "incomingEncoding", js.undefined)
      
      @scala.inline
      def setJQuery(value: js.Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJQueryUndefined: Self = StObject.set(x, "jQuery", js.undefined)
      
      @scala.inline
      def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPreRequest(
        value: (/* options */ CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
      ): Self = StObject.set(x, "preRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreRequestUndefined: Self = StObject.set(x, "preRequest", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      @scala.inline
      def setReferer(value: `false` | String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
      
      @scala.inline
      def setRotateUA(value: Boolean): Self = StObject.set(x, "rotateUA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUAUndefined: Self = StObject.set(x, "rotateUA", js.undefined)
      
      @scala.inline
      def setSeenreq(value: js.Any): Self = StObject.set(x, "seenreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeenreqUndefined: Self = StObject.set(x, "seenreq", js.undefined)
      
      @scala.inline
      def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "skipDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDuplicatesUndefined: Self = StObject.set(x, "skipDuplicates", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String | js.Array[String]): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setUserAgentVarargs(value: String*): Self = StObject.set(x, "userAgent", js.Array(value :_*))
    }
  }
  
  // Following 2 types are taken from `request` definitions.
  // as importing `request` v2.88.2 definitions cause DT tests to fail.
  type Headers = StringDictionary[js.Any]
  
  @js.native
  trait RequestAsJSON extends StObject {
    
    var headers: Headers = js.native
    
    var method: String = js.native
    
    var uri: Url = js.native
  }
  object RequestAsJSON {
    
    @scala.inline
    def apply(headers: Headers, method: String, uri: Url): RequestAsJSON = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAsJSON]
    }
    
    @scala.inline
    implicit class RequestAsJSONMutableBuilder[Self <: RequestAsJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
