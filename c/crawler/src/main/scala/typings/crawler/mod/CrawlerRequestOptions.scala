package typings.crawler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CrawlerRequestOptionsOps[Self <: CrawlerRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (/* err */ Error, /* res */ CrawlerRequestResponse, /* done */ js.Function0[Unit]) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
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
      value: (CrawlerRequestOptions, /* doRequest */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit
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
