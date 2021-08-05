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
  
  inline def apply(): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
  
  extension [Self <: CreateLocalGatewayRouteTableVpcAssociationResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVpcAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
}
