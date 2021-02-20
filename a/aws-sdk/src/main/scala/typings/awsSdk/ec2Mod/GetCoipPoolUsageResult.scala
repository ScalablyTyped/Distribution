package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCoipPoolUsageResult extends StObject {
  
  /**
    * Information about the address usage.
    */
  var CoipAddressUsages: js.UndefOr[CoipAddressUsageSet] = js.native
  
  /**
    * The ID of the customer-owned address pool.
    */
  var CoipPoolId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
}
object GetCoipPoolUsageResult {
  
  @scala.inline
  def apply(): GetCoipPoolUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoipPoolUsageResult]
  }
  
  @scala.inline
  implicit class GetCoipPoolUsageResultMutableBuilder[Self <: GetCoipPoolUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoipAddressUsages(value: CoipAddressUsageSet): Self = StObject.set(x, "CoipAddressUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoipAddressUsagesUndefined: Self = StObject.set(x, "CoipAddressUsages", js.undefined)
    
    @scala.inline
    def setCoipAddressUsagesVarargs(value: CoipAddressUsage*): Self = StObject.set(x, "CoipAddressUsages", js.Array(value :_*))
    
    @scala.inline
    def setCoipPoolId(value: String): Self = StObject.set(x, "CoipPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoipPoolIdUndefined: Self = StObject.set(x, "CoipPoolId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "LocalGatewayRouteTableId", js.undefined)
  }
}
