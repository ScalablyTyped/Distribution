package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointRequest extends js.Object {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being deleted.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}
object DeleteEndpointRequest {
  
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointRequestOps[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
}
