package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationPreferences extends js.Object {
  /**
    * The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region. If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in any subsequent Regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both).
    */
  var FailureToleranceCount: js.UndefOr[typings.awsSdk.cloudformationMod.FailureToleranceCount] = js.native
  /**
    * The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region. If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in any subsequent Regions. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both.
    */
  var FailureTolerancePercentage: js.UndefOr[typings.awsSdk.cloudformationMod.FailureTolerancePercentage] = js.native
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount—MaxConcurrentCount is at most one more than the FailureToleranceCount . Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentCount: js.UndefOr[typings.awsSdk.cloudformationMod.MaxConcurrentCount] = js.native
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentPercentage: js.UndefOr[typings.awsSdk.cloudformationMod.MaxConcurrentPercentage] = js.native
  /**
    * The order of the Regions in where you want to perform the stack operation.
    */
  var RegionOrder: js.UndefOr[RegionList] = js.native
}

object StackSetOperationPreferences {
  @scala.inline
  def apply(
    FailureToleranceCount: Int | Double = null,
    FailureTolerancePercentage: Int | Double = null,
    MaxConcurrentCount: Int | Double = null,
    MaxConcurrentPercentage: Int | Double = null,
    RegionOrder: RegionList = null
  ): StackSetOperationPreferences = {
    val __obj = js.Dynamic.literal()
    if (FailureToleranceCount != null) __obj.updateDynamic("FailureToleranceCount")(FailureToleranceCount.asInstanceOf[js.Any])
    if (FailureTolerancePercentage != null) __obj.updateDynamic("FailureTolerancePercentage")(FailureTolerancePercentage.asInstanceOf[js.Any])
    if (MaxConcurrentCount != null) __obj.updateDynamic("MaxConcurrentCount")(MaxConcurrentCount.asInstanceOf[js.Any])
    if (MaxConcurrentPercentage != null) __obj.updateDynamic("MaxConcurrentPercentage")(MaxConcurrentPercentage.asInstanceOf[js.Any])
    if (RegionOrder != null) __obj.updateDynamic("RegionOrder")(RegionOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetOperationPreferences]
  }
}

