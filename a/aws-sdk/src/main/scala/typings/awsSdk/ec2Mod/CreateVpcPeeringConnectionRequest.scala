package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcPeeringConnectionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS account ID of the owner of the accepter VPC. Default: Your AWS account ID
    */
  var PeerOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Region code for the accepter VPC, if the accepter VPC is located in a Region other than the Region in which you make the request. Default: The Region in which you make the request.
    */
  var PeerRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC with which you are creating the VPC peering connection. You must specify this parameter in the request.
    */
  var PeerVpcId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to assign to the peering connection.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the requester VPC. You must specify this parameter in the request.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
}
object CreateVpcPeeringConnectionRequest {
  
  inline def apply(): CreateVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionRequest]
  }
  
  extension [Self <: CreateVpcPeeringConnectionRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPeerOwnerId(value: String): Self = StObject.set(x, "PeerOwnerId", value.asInstanceOf[js.Any])
    
    inline def setPeerOwnerIdUndefined: Self = StObject.set(x, "PeerOwnerId", js.undefined)
    
    inline def setPeerRegion(value: String): Self = StObject.set(x, "PeerRegion", value.asInstanceOf[js.Any])
    
    inline def setPeerRegionUndefined: Self = StObject.set(x, "PeerRegion", js.undefined)
    
    inline def setPeerVpcId(value: String): Self = StObject.set(x, "PeerVpcId", value.asInstanceOf[js.Any])
    
    inline def setPeerVpcIdUndefined: Self = StObject.set(x, "PeerVpcId", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
