package typings.crawler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.crawler.anon.Log
import typings.crawler.crawlerBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CreateCrawlerOptionsOps[Self <: CreateCrawlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoWindowClose(value: Boolean): Self = this.set("autoWindowClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWindowClose: Self = this.set("autoWindowClose", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setForceUTF8(value: Boolean): Self = this.set("forceUTF8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUTF8: Self = this.set("forceUTF8", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHomogeneous(value: Boolean): Self = this.set("homogeneous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomogeneous: Self = this.set("homogeneous", js.undefined)
    
    @scala.inline
    def setIncomingEncoding(value: String): Self = this.set("incomingEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingEncoding: Self = this.set("incomingEncoding", js.undefined)
    
    @scala.inline
    def setJQuery(value: js.Any): Self = this.set("jQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJQuery: Self = this.set("jQuery", js.undefined)
    
    @scala.inline
    def setLogger(value: Log): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPreRequest(
      value: (/* options */ CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
    ): Self = this.set("preRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreRequest: Self = this.set("preRequest", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setPriorityRange(value: Double): Self = this.set("priorityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorityRange: Self = this.set("priorityRange", js.undefined)
    
    @scala.inline
    def setRateLimit(value: Double): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
    
    @scala.inline
    def setReferer(value: `false` | String): Self = this.set("referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferer: Self = this.set("referer", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetryTimeout(value: Double): Self = this.set("retryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryTimeout: Self = this.set("retryTimeout", js.undefined)
    
    @scala.inline
    def setRotateUA(value: Boolean): Self = this.set("rotateUA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateUA: Self = this.set("rotateUA", js.undefined)
    
    @scala.inline
    def setSeenreq(value: js.Any): Self = this.set("seenreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeenreq: Self = this.set("seenreq", js.undefined)
    
    @scala.inline
    def setSkipDuplicates(value: Boolean): Self = this.set("skipDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDuplicates: Self = this.set("skipDuplicates", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserAgentVarargs(value: String*): Self = this.set("userAgent", js.Array(value :_*))
    
    @scala.inline
    def setUserAgent(value: String | js.Array[String]): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
