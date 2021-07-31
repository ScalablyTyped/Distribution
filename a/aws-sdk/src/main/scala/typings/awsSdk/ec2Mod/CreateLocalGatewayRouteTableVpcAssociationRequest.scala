package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableVpcAssociationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId
  
  /**
    * The tags to assign to the local gateway route table VPC association.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId
}
object CreateLocalGatewayRouteTableVpcAssociationRequest {
  
  @scala.inline
  def apply(LocalGatewayRouteTableId: LocalGatewayRoutetableId, VpcId: VpcId): CreateLocalGatewayRouteTableVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationRequest]
  }
  
  @scala.inline
  implicit class CreateLocalGatewayRouteTableVpcAssociationRequestMutableBuilder[Self <: CreateLocalGatewayRouteTableVpcAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
