package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableVpcAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.undefined
}
object CreateLocalGatewayRouteTableVpcAssociationResult {
  
  @scala.inline
  def apply(): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
  
  @scala.inline
  implicit class CreateLocalGatewayRouteTableVpcAssociationResultMutableBuilder[Self <: CreateLocalGatewayRouteTableVpcAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
}
