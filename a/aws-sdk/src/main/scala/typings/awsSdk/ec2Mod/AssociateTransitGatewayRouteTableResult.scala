package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayRouteTableResult extends StObject {
  
  /**
    * The ID of the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.undefined
}
object AssociateTransitGatewayRouteTableResult {
  
  @scala.inline
  def apply(): AssociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class AssociateTransitGatewayRouteTableResultMutableBuilder[Self <: AssociateTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: TransitGatewayAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
