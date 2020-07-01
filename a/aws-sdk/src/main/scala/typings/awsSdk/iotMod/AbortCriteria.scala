package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortCriteria extends js.Object {
  /**
    * The type of job action to take to initiate the job abort.
    */
  var action: AbortAction = js.native
  /**
    * The type of job execution failures that can initiate a job abort.
    */
  var failureType: JobExecutionFailureType = js.native
  /**
    * The minimum number of things which must receive job execution notifications before the job can be aborted.
    */
  var minNumberOfExecutedThings: MinimumNumberOfExecutedThings = js.native
  /**
    * The minimum percentage of job execution failures that must occur to initiate the job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AbortThresholdPercentage = js.native
}

object AbortCriteria {
  @scala.inline
  def apply(
    action: AbortAction,
    failureType: JobExecutionFailureType,
    minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
    thresholdPercentage: AbortThresholdPercentage
  ): AbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortCriteria]
  }
}

