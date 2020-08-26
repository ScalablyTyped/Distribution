package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoppingCondition extends js.Object {
  /**
    * The maximum length of time, in seconds, that the training or compilation job can run. If job does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. The maximum value is 28 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimeInSeconds] = js.native
  /**
    * The maximum length of time, in seconds, how long you are willing to wait for a managed spot training job to complete. It is the amount of time spent waiting for Spot capacity plus the amount of time the training job runs. It must be equal to or greater than MaxRuntimeInSeconds. 
    */
  var MaxWaitTimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxWaitTimeInSeconds] = js.native
}

object StoppingCondition {
  @scala.inline
  def apply(): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoppingCondition]
  }
  @scala.inline
  implicit class StoppingConditionOps[Self <: StoppingCondition] (val x: Self) extends AnyVal {
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
    def setMaxRuntimeInSeconds(value: MaxRuntimeInSeconds): Self = this.set("MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRuntimeInSeconds: Self = this.set("MaxRuntimeInSeconds", js.undefined)
    @scala.inline
    def setMaxWaitTimeInSeconds(value: MaxWaitTimeInSeconds): Self = this.set("MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWaitTimeInSeconds: Self = this.set("MaxWaitTimeInSeconds", js.undefined)
  }
  
}

