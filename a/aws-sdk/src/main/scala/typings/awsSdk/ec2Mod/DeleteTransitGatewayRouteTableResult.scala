package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTable] = js.undefined
}
object DeleteTransitGatewayRouteTableResult {
  
  inline def apply(): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
  
  extension [Self <: DeleteTransitGatewayRouteTableResult](x: Self) {
    
    inline def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
  }
}
