package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableVpcAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.undefined
}
object DeleteLocalGatewayRouteTableVpcAssociationResult {
  
  inline def apply(): DeleteLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVpcAssociationResult]
  }
  
  extension [Self <: DeleteLocalGatewayRouteTableVpcAssociationResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVpcAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
}
