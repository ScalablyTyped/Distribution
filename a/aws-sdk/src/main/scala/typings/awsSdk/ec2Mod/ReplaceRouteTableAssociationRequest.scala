package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRouteTableAssociationRequest extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: RouteTableAssociationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the new route table to associate with the subnet.
    */
  var RouteTableId: typings.awsSdk.ec2Mod.RouteTableId
}
object ReplaceRouteTableAssociationRequest {
  
  @scala.inline
  def apply(AssociationId: RouteTableAssociationId, RouteTableId: RouteTableId): ReplaceRouteTableAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteTableAssociationRequest]
  }
  
  @scala.inline
  implicit class ReplaceRouteTableAssociationRequestMutableBuilder[Self <: ReplaceRouteTableAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: RouteTableAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: RouteTableId): Self = StObject.set(x, "RouteTableId", value.asInstanceOf[js.Any])
  }
}
