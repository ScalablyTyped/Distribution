package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult extends StObject {
  
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation] = js.undefined
}
object CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult {
  
  inline def apply(): CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult]
  }
  
  extension [Self <: CreateLocalGatewayRouteTableVirtualInterfaceGroupAssociationResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociation(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociation", js.undefined)
  }
}
