package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoipPoolUsageResult extends StObject {
  
  /**
    * Information about the address usage.
    */
  var CoipAddressUsages: js.UndefOr[CoipAddressUsageSet] = js.undefined
  
  /**
    * The ID of the customer-owned address pool.
    */
  var CoipPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.undefined
}
object GetCoipPoolUsageResult {
  
  inline def apply(): GetCoipPoolUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoipPoolUsageResult]
  }
  
  extension [Self <: GetCoipPoolUsageResult](x: Self) {
    
    inline def setCoipAddressUsages(value: CoipAddressUsageSet): Self = StObject.set(x, "CoipAddressUsages", value.asInstanceOf[js.Any])
    
    inline def setCoipAddressUsagesUndefined: Self = StObject.set(x, "CoipAddressUsages", js.undefined)
    
    inline def setCoipAddressUsagesVarargs(value: CoipAddressUsage*): Self = StObject.set(x, "CoipAddressUsages", js.Array(value*))
    
    inline def setCoipPoolId(value: String): Self = StObject.set(x, "CoipPoolId", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolIdUndefined: Self = StObject.set(x, "CoipPoolId", js.undefined)
    
    inline def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
  }
}
