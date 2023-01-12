package typings.crawler

import org.scalablytyped.runtime.StringDictionary
import typings.crawler.anon.Log
import typings.crawler.anon.OmitCrawlerRequestOptions
import typings.crawler.crawlerBooleans.`false`
import typings.crawler.crawlerStrings.drain
import typings.crawler.crawlerStrings.limiterChange
import typings.crawler.crawlerStrings.request
import typings.crawler.crawlerStrings.schedule
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crawler", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Crawler {
    def this(options: CreateCrawlerOptions) = this()
  }
  
  @js.native
  trait Crawler extends EventEmitter {
    
    def direct(options: OmitCrawlerRequestOptions): Unit = js.native
    
    def on(channel: schedule | request, listener: js.Function1[/* options */ CrawlerRequestOptions, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(channel: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_limiterChange(
      channel: limiterChange,
      listener: js.Function2[/* options */ CrawlerRequestOptions, /* limiter */ String, Unit]
    ): this.type = js.native
    
    def queue(urisOrOptions: String): Unit = js.native
    def queue(urisOrOptions: js.Array[CrawlerRequestOptions | String]): Unit = js.native
    def queue(urisOrOptions: CrawlerRequestOptions): Unit = js.native
    
    val queueSize: Double = js.native
    
    def setLimiterProperty(limiter: String): Unit = js.native
    def setLimiterProperty(limiter: String, property: String): Unit = js.native
    def setLimiterProperty(limiter: String, property: String, value: Any): Unit = js.native
    def setLimiterProperty(limiter: String, property: Unit, value: Any): Unit = js.native
  }
  
  trait CrawlerRequestOptions
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var callback: js.UndefOr[
        js.Function3[
          /* err */ js.Error, 
          /* res */ CrawlerRequestResponse, 
          /* done */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var jQuery: js.UndefOr[Any] = js.undefined
    
    var jquery: js.UndefOr[Any] = js.undefined
    
    var limiter: js.UndefOr[String] = js.undefined
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var proxies: js.UndefOr[js.Array[Any]] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object CrawlerRequestOptions {
    
    inline def apply(): CrawlerRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrawlerRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrawlerRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* err */ js.Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJQuery(value: Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      inline def setJQueryUndefined: Self = StObject.set(x, "jQuery", js.undefined)
      
      inline def setLimiter(value: String): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
      
      inline def setPreRequest(
        value: (CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait CrawlerRequestResponse
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    @JSName("$")
    var $: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.CheerioAPI */ Any
    
    var body: Buffer | String
    
    var options: CrawlerRequestOptions
    
    var request: RequestAsJSON
  }
  object CrawlerRequestResponse {
    
    inline def apply(
      $: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.CheerioAPI */ Any,
      body: Buffer | String,
      options: CrawlerRequestOptions,
      request: RequestAsJSON
    ): CrawlerRequestResponse = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrawlerRequestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrawlerRequestResponse] (val x: Self) extends AnyVal {
      
      inline def set$(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify cheerio.CheerioAPI */ Any
      ): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Buffer | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CrawlerRequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: RequestAsJSON): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateCrawlerOptions
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var autoWindowClose: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[
        js.Function3[
          /* err */ js.Error, 
          /* res */ CrawlerRequestResponse, 
          /* done */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var forceUTF8: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var homogeneous: js.UndefOr[Boolean] = js.undefined
    
    var http2: js.UndefOr[Boolean] = js.undefined
    
    var incomingEncoding: js.UndefOr[String] = js.undefined
    
    var jQuery: js.UndefOr[Any] = js.undefined
    
    var jquery: js.UndefOr[Any] = js.undefined
    
    var logger: js.UndefOr[Log] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var preRequest: js.UndefOr[
        js.Function2[
          /* options */ CrawlerRequestOptions, 
          /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var priorityRange: js.UndefOr[Double] = js.undefined
    
    var rateLimit: js.UndefOr[Double] = js.undefined
    
    var referer: js.UndefOr[`false` | String] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryTimeout: js.UndefOr[Double] = js.undefined
    
    var rotateUA: js.UndefOr[Boolean] = js.undefined
    
    var seenreq: js.UndefOr[Any] = js.undefined
    
    var skipDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userAgent: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CreateCrawlerOptions {
    
    inline def apply(): CreateCrawlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCrawlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCrawlerOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoWindowClose(value: Boolean): Self = StObject.set(x, "autoWindowClose", value.asInstanceOf[js.Any])
      
      inline def setAutoWindowCloseUndefined: Self = StObject.set(x, "autoWindowClose", js.undefined)
      
      inline def setCallback(
        value: (/* err */ js.Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setForceUTF8(value: Boolean): Self = StObject.set(x, "forceUTF8", value.asInstanceOf[js.Any])
      
      inline def setForceUTF8Undefined: Self = StObject.set(x, "forceUTF8", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHomogeneous(value: Boolean): Self = StObject.set(x, "homogeneous", value.asInstanceOf[js.Any])
      
      inline def setHomogeneousUndefined: Self = StObject.set(x, "homogeneous", js.undefined)
      
      inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setIncomingEncoding(value: String): Self = StObject.set(x, "incomingEncoding", value.asInstanceOf[js.Any])
      
      inline def setIncomingEncodingUndefined: Self = StObject.set(x, "incomingEncoding", js.undefined)
      
      inline def setJQuery(value: Any): Self = StObject.set(x, "jQuery", value.asInstanceOf[js.Any])
      
      inline def setJQueryUndefined: Self = StObject.set(x, "jQuery", js.undefined)
      
      inline def setLogger(value: Log): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPreRequest(
        value: (/* options */ CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "preRequest", js.Any.fromFunction2(value))
      
      inline def setPreRequestUndefined: Self = StObject.set(x, "preRequest", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
      
      inline def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRateLimit(value: Double): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
      
      inline def setReferer(value: `false` | String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
      
      inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryTimeout(value: Double): Self = StObject.set(x, "retryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeoutUndefined: Self = StObject.set(x, "retryTimeout", js.undefined)
      
      inline def setRotateUA(value: Boolean): Self = StObject.set(x, "rotateUA", value.asInstanceOf[js.Any])
      
      inline def setRotateUAUndefined: Self = StObject.set(x, "rotateUA", js.undefined)
      
      inline def setSeenreq(value: Any): Self = StObject.set(x, "seenreq", value.asInstanceOf[js.Any])
      
      inline def setSeenreqUndefined: Self = StObject.set(x, "seenreq", js.undefined)
      
      inline def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "skipDuplicates", value.asInstanceOf[js.Any])
      
      inline def setSkipDuplicatesUndefined: Self = StObject.set(x, "skipDuplicates", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgent(value: String | js.Array[String]): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUserAgentVarargs(value: String*): Self = StObject.set(x, "userAgent", js.Array(value*))
    }
  }
  
  // Following 2 types are taken from `request` definitions.
  // as importing `request` v2.88.2 definitions cause DT tests to fail.
  type Headers = StringDictionary[Any]
  
  trait RequestAsJSON extends StObject {
    
    var headers: Headers
    
    var method: String
    
    var uri: Url
  }
  object RequestAsJSON {
    
    inline def apply(headers: Headers, method: String, uri: Url): RequestAsJSON = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAsJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestAsJSON] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
