package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRouteTableRequest extends StObject {
  
  /**
    * The association ID representing the current association between the route table and subnet or gateway.
    */
  var AssociationId: RouteTableAssociationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DisassociateRouteTableRequest {
  
  @scala.inline
  def apply(AssociationId: RouteTableAssociationId): DisassociateRouteTableRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRouteTableRequest]
  }
  
  @scala.inline
  implicit class DisassociateRouteTableRequestMutableBuilder[Self <: DisassociateRouteTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: RouteTableAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
