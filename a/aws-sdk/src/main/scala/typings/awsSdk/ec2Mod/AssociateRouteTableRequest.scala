package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateRouteTableRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the internet gateway or virtual private gateway.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.undefined
}
object AssociateRouteTableRequest {
  
  @scala.inline
  def apply(RouteTableId: RouteTableId): AssociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRouteTableRequest]
  }
  
  @scala.inline
  implicit class AssociateRouteTableRequestMutableBuilder[Self <: AssociateRouteTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGatewayId(value: RouteGatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
