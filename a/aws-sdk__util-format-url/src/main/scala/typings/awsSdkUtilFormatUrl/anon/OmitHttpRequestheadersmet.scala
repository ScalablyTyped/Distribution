package typings.awsSdkUtilFormatUrl.anon

import typings.awsSdkTypes.httpMod.QueryParameterBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/types.@aws-sdk/types.HttpRequest, 'headers' | 'method'> */
@js.native
trait OmitHttpRequestheadersmet extends js.Object {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var hostname: String = js.native
  
  var path: String = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var protocol: String = js.native
  
  var query: js.UndefOr[QueryParameterBag] = js.native
}
object OmitHttpRequestheadersmet {
  
  @scala.inline
  def apply(hostname: String, path: String, protocol: String): OmitHttpRequestheadersmet = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitHttpRequestheadersmet]
  }
  
  @scala.inline
  implicit class OmitHttpRequestheadersmetOps[Self <: OmitHttpRequestheadersmet] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setQuery(value: QueryParameterBag): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
