package typings.chrome.chrome.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyRules extends js.Object {
  
  /** Optional. List of servers to connect to without a proxy server. */
  var bypassList: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The proxy server to be used for everthing else or if any of the specific proxyFor... is not specified. */
  var fallbackProxy: js.UndefOr[ProxyServer] = js.native
  
  /** Optional. The proxy server to be used for FTP requests. */
  var proxyForFtp: js.UndefOr[ProxyServer] = js.native
  
  /** Optional. The proxy server to be used for HTTP requests. */
  var proxyForHttp: js.UndefOr[ProxyServer] = js.native
  
  /** Optional. The proxy server to be used for HTTPS requests. */
  var proxyForHttps: js.UndefOr[ProxyServer] = js.native
  
  /** Optional. The proxy server to be used for all per-URL requests (that is http, https, and ftp). */
  var singleProxy: js.UndefOr[ProxyServer] = js.native
}
object ProxyRules {
  
  @scala.inline
  def apply(): ProxyRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyRules]
  }
  
  @scala.inline
  implicit class ProxyRulesOps[Self <: ProxyRules] (val x: Self) extends AnyVal {
    
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
    def setBypassListVarargs(value: String*): Self = this.set("bypassList", js.Array(value :_*))
    
    @scala.inline
    def setBypassList(value: js.Array[String]): Self = this.set("bypassList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassList: Self = this.set("bypassList", js.undefined)
    
    @scala.inline
    def setFallbackProxy(value: ProxyServer): Self = this.set("fallbackProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackProxy: Self = this.set("fallbackProxy", js.undefined)
    
    @scala.inline
    def setProxyForFtp(value: ProxyServer): Self = this.set("proxyForFtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyForFtp: Self = this.set("proxyForFtp", js.undefined)
    
    @scala.inline
    def setProxyForHttp(value: ProxyServer): Self = this.set("proxyForHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyForHttp: Self = this.set("proxyForHttp", js.undefined)
    
    @scala.inline
    def setProxyForHttps(value: ProxyServer): Self = this.set("proxyForHttps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyForHttps: Self = this.set("proxyForHttps", js.undefined)
    
    @scala.inline
    def setSingleProxy(value: ProxyServer): Self = this.set("singleProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleProxy: Self = this.set("singleProxy", js.undefined)
  }
}
