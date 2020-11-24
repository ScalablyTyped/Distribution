package typings.crawler.anon

import typings.crawler.mod.CrawlerRequestOptions
import typings.crawler.mod.CrawlerRequestResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<crawler.crawler.CrawlerRequestOptions, 'callback'> & {callback (error : std.Error, response : crawler.crawler.CrawlerRequestResponse): void} */
@js.native
trait OmitCrawlerRequestOptions extends js.Object {
  
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
  implicit class OmitCrawlerRequestOptionsOps[Self <: OmitCrawlerRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (Error, CrawlerRequestResponse) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setJQuery(value: js.Any): Self = this.set("jQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJQuery: Self = this.set("jQuery", js.undefined)
    
    @scala.inline
    def setLimiter(value: String): Self = this.set("limiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimiter: Self = this.set("limiter", js.undefined)
    
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
    def setProxiesVarargs(value: js.Any*): Self = this.set("proxies", js.Array(value :_*))
    
    @scala.inline
    def setProxies(value: js.Array[_]): Self = this.set("proxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxies: Self = this.set("proxies", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
