package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectVpcEndpointConnectionsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
  
  /**
    * The IDs of one or more VPC endpoints.
    */
  var VpcEndpointIds: VpcEndpointIdList = js.native
}
object RejectVpcEndpointConnectionsRequest {
  
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId, VpcEndpointIds: VpcEndpointIdList): RejectVpcEndpointConnectionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any], VpcEndpointIds = VpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectVpcEndpointConnectionsRequest]
  }
  
  @scala.inline
  implicit class RejectVpcEndpointConnectionsRequestOps[Self <: RejectVpcEndpointConnectionsRequest] (val x: Self) extends AnyVal {
    
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
    def setServiceId(value: VpcEndpointServiceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = this.set("VpcEndpointIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcEndpointIds(value: VpcEndpointIdList): Self = this.set("VpcEndpointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
