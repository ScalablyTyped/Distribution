package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCoipPoolUsageResult extends js.Object {
  
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
  implicit class GetCoipPoolUsageResultOps[Self <: GetCoipPoolUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoipAddressUsagesVarargs(value: CoipAddressUsage*): Self = this.set("CoipAddressUsages", js.Array(value :_*))
    
    @scala.inline
    def setCoipAddressUsages(value: CoipAddressUsageSet): Self = this.set("CoipAddressUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoipAddressUsages: Self = this.set("CoipAddressUsages", js.undefined)
    
    @scala.inline
    def setCoipPoolId(value: String): Self = this.set("CoipPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoipPoolId: Self = this.set("CoipPoolId", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("LocalGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("LocalGatewayRouteTableId", js.undefined)
  }
}
