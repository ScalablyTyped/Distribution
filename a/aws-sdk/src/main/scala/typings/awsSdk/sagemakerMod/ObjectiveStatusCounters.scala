package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectiveStatusCounters extends js.Object {
  /**
    * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.
    */
  var Failed: js.UndefOr[ObjectiveStatusCounter] = js.native
  /**
    * The number of training jobs that are in progress and pending evaluation of their final objective metric.
    */
  var Pending: js.UndefOr[ObjectiveStatusCounter] = js.native
  /**
    * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.
    */
  var Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.native
}

object ObjectiveStatusCounters {
  @scala.inline
  def apply(): ObjectiveStatusCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectiveStatusCounters]
  }
  @scala.inline
  implicit class ObjectiveStatusCountersOps[Self <: ObjectiveStatusCounters] (val x: Self) extends AnyVal {
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
    def setFailed(value: ObjectiveStatusCounter): Self = this.set("Failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("Failed", js.undefined)
    @scala.inline
    def setPending(value: ObjectiveStatusCounter): Self = this.set("Pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
    @scala.inline
    def setSucceeded(value: ObjectiveStatusCounter): Self = this.set("Succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceeded: Self = this.set("Succeeded", js.undefined)
  }
  
}

