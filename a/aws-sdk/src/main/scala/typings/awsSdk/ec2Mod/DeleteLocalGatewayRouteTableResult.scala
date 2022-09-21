package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableResult extends StObject {
  
  var LocalGatewayRouteTable: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTable] = js.undefined
}
object DeleteLocalGatewayRouteTableResult {
  
  inline def apply(): DeleteLocalGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableResult]
  }
  
  extension [Self <: DeleteLocalGatewayRouteTableResult](x: Self) {
    
    inline def setLocalGatewayRouteTable(value: LocalGatewayRouteTable): Self = StObject.set(x, "LocalGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableUndefined: Self = StObject.set(x, "LocalGatewayRouteTable", js.undefined)
  }
}
