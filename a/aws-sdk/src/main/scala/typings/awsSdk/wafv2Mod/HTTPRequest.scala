package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPRequest extends js.Object {
  
  /**
    * The IP address that the request originated from. If the web ACL is associated with a CloudFront distribution, this is the value of one of the following fields in CloudFront access logs:    c-ip, if the viewer did not use an HTTP proxy or a load balancer to send the request    x-forwarded-for, if the viewer did use an HTTP proxy or a load balancer to send the request  
    */
  var ClientIP: js.UndefOr[IPString] = js.native
  
  /**
    * The two-letter country code for the country that the request originated from. For a current list of country codes, see the Wikipedia entry ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[typings.awsSdk.wafv2Mod.Country] = js.native
  
  /**
    * The HTTP version specified in the sampled web request, for example, HTTP/1.1.
    */
  var HTTPVersion: js.UndefOr[typings.awsSdk.wafv2Mod.HTTPVersion] = js.native
  
  /**
    * A complex type that contains the name and value for each header in the sampled web request.
    */
  var Headers: js.UndefOr[HTTPHeaders] = js.native
  
  /**
    * The HTTP method specified in the sampled web request. 
    */
  var Method: js.UndefOr[HTTPMethod] = js.native
  
  /**
    * The URI path of the request, which identifies the resource, for example, /images/daily-ad.jpg.
    */
  var URI: js.UndefOr[URIString] = js.native
}
object HTTPRequest {
  
  @scala.inline
  def apply(): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPRequest]
  }
  
  @scala.inline
  implicit class HTTPRequestOps[Self <: HTTPRequest] (val x: Self) extends AnyVal {
    
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
    def setClientIP(value: IPString): Self = this.set("ClientIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIP: Self = this.set("ClientIP", js.undefined)
    
    @scala.inline
    def setCountry(value: Country): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setHTTPVersion(value: HTTPVersion): Self = this.set("HTTPVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTTPVersion: Self = this.set("HTTPVersion", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HTTPHeader*): Self = this.set("Headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: HTTPHeaders): Self = this.set("Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("Headers", js.undefined)
    
    @scala.inline
    def setMethod(value: HTTPMethod): Self = this.set("Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("Method", js.undefined)
    
    @scala.inline
    def setURI(value: URIString): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURI: Self = this.set("URI", js.undefined)
  }
}
