package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcPeeringConnectionOptionsRequest extends StObject {
  
  /**
    * The VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: typings.awsSdk.ec2Mod.VpcPeeringConnectionId
}
object ModifyVpcPeeringConnectionOptionsRequest {
  
  @scala.inline
  def apply(VpcPeeringConnectionId: VpcPeeringConnectionId): ModifyVpcPeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
  }
  
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsRequestMutableBuilder[Self <: ModifyVpcPeeringConnectionOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = StObject.set(x, "AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "AccepterPeeringConnectionOptions", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptionsRequest): Self = StObject.set(x, "RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPeeringConnectionOptionsUndefined: Self = StObject.set(x, "RequesterPeeringConnectionOptions", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
