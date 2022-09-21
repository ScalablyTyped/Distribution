package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoipCidr extends StObject {
  
  /**
    *  An address range in a customer-owned IP address space. 
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the address pool. 
    */
  var CoipPoolId: js.UndefOr[Ipv4PoolCoipId] = js.undefined
  
  /**
    *  The ID of the local gateway route table. 
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.undefined
}
object CoipCidr {
  
  inline def apply(): CoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipCidr]
  }
  
  extension [Self <: CoipCidr](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setCoipPoolId(value: Ipv4PoolCoipId): Self = StObject.set(x, "CoipPoolId", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolIdUndefined: Self = StObject.set(x, "CoipPoolId", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
  }
}
