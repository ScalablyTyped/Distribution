package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedConcurrencyConfigListItem extends js.Object {
  /**
    * The amount of provisioned concurrency allocated.
    */
  var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The amount of provisioned concurrency available.
    */
  var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alias or version.
    */
  var FunctionArn: js.UndefOr[typings.awsSdk.lambdaMod.FunctionArn] = js.native
  /**
    * The date and time that a user last updated the configuration, in ISO 8601 format.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The amount of provisioned concurrency requested.
    */
  var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.native
  /**
    * The status of the allocation process.
    */
  var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.native
  /**
    * For failed allocations, the reason that provisioned concurrency could not be allocated.
    */
  var StatusReason: js.UndefOr[String] = js.native
}

object ProvisionedConcurrencyConfigListItem {
  @scala.inline
  def apply(
    AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
    AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
    FunctionArn: FunctionArn = null,
    LastModified: Timestamp = null,
    RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined,
    Status: ProvisionedConcurrencyStatusEnum = null,
    StatusReason: String = null
  ): ProvisionedConcurrencyConfigListItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedProvisionedConcurrentExecutions)) __obj.updateDynamic("AllocatedProvisionedConcurrentExecutions")(AllocatedProvisionedConcurrentExecutions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AvailableProvisionedConcurrentExecutions)) __obj.updateDynamic("AvailableProvisionedConcurrentExecutions")(AvailableProvisionedConcurrentExecutions.get.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestedProvisionedConcurrentExecutions)) __obj.updateDynamic("RequestedProvisionedConcurrentExecutions")(RequestedProvisionedConcurrentExecutions.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedConcurrencyConfigListItem]
  }
}

