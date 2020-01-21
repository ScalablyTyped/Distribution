package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedInstancesExchangeQuoteRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the Convertible Reserved Instances to exchange.
    */
  var ReservedInstanceIds: ReservedInstanceIdSet = js.native
  /**
    * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
    */
  var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.native
}

object GetReservedInstancesExchangeQuoteRequest {
  @scala.inline
  def apply(
    ReservedInstanceIds: ReservedInstanceIdSet,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    TargetConfigurations: TargetConfigurationRequestSet = null
  ): GetReservedInstancesExchangeQuoteRequest = {
    val __obj = js.Dynamic.literal(ReservedInstanceIds = ReservedInstanceIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (TargetConfigurations != null) __obj.updateDynamic("TargetConfigurations")(TargetConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteRequest]
  }
}

