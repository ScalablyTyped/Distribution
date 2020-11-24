package typings.awsSdk.s3outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointRequest extends js.Object {
  
  /**
    * The ID of the end point.
    */
  var EndpointId: typings.awsSdk.s3outpostsMod.EndpointId = js.native
  
  /**
    * The ID of the AWS Outpost. 
    */
  var OutpostId: typings.awsSdk.s3outpostsMod.OutpostId = js.native
}
object DeleteEndpointRequest {
  
  @scala.inline
  def apply(EndpointId: EndpointId, OutpostId: OutpostId): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointId = EndpointId.asInstanceOf[js.Any], OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointRequestOps[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
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
    def setEndpointId(value: EndpointId): Self = this.set("EndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
  }
}
