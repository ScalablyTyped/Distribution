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
  @scala.inline
  implicit class AbortCriteriaOps[Self <: AbortCriteria] (val x: Self) extends AnyVal {
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
    def setAction(value: AbortAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureType(value: JobExecutionFailureType): Self = this.set("failureType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinNumberOfExecutedThings(value: MinimumNumberOfExecutedThings): Self = this.set("minNumberOfExecutedThings", value.asInstanceOf[js.Any])
    @scala.inline
    def setThresholdPercentage(value: AbortThresholdPercentage): Self = this.set("thresholdPercentage", value.asInstanceOf[js.Any])
  }
  
}

