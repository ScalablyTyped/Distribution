package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CoipAddressUsages: CoipAddressUsageSet = null,
    CoipPoolId: String = null,
    LocalGatewayRouteTableId: String = null
  ): GetCoipPoolUsageResult = {
    val __obj = js.Dynamic.literal()
    if (CoipAddressUsages != null) __obj.updateDynamic("CoipAddressUsages")(CoipAddressUsages.asInstanceOf[js.Any])
    if (CoipPoolId != null) __obj.updateDynamic("CoipPoolId")(CoipPoolId.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableId != null) __obj.updateDynamic("LocalGatewayRouteTableId")(LocalGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoipPoolUsageResult]
  }
}

