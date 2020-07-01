package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobAbortCriteria extends js.Object {
  /**
    * The type of job action to take to initiate the job abort.
    */
  var action: AwsJobAbortCriteriaAbortAction = js.native
  /**
    * The type of job execution failures that can initiate a job abort.
    */
  var failureType: AwsJobAbortCriteriaFailureType = js.native
  /**
    * The minimum number of things which must receive job execution notifications before the job can be aborted.
    */
  var minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings = js.native
  /**
    * The minimum percentage of job execution failures that must occur to initiate the job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage = js.native
}

object AwsJobAbortCriteria {
  @scala.inline
  def apply(
    action: AwsJobAbortCriteriaAbortAction,
    failureType: AwsJobAbortCriteriaFailureType,
    minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings,
    thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage
  ): AwsJobAbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobAbortCriteria]
  }
}

