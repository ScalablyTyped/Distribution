package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactMethodsRequest extends js.Object {
  
  /**
    * The protocols used to send notifications, such as Email, or SMS (text messaging). Specify a protocol in your request to return information about a specific contact method protocol.
    */
  var protocols: js.UndefOr[ContactProtocolsList] = js.native
}
object GetContactMethodsRequest {
  
  @scala.inline
  def apply(): GetContactMethodsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsRequest]
  }
  
  @scala.inline
  implicit class GetContactMethodsRequestOps[Self <: GetContactMethodsRequest] (val x: Self) extends AnyVal {
    
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
    def setProtocolsVarargs(value: ContactProtocol*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: ContactProtocolsList): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
  }
}
