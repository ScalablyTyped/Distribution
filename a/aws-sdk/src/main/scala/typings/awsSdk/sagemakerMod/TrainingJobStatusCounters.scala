package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingJobStatusCounters extends js.Object {
  
  /**
    * The number of completed training jobs launched by the hyperparameter tuning job.
    */
  var Completed: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of in-progress training jobs launched by a hyperparameter tuning job.
    */
  var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
    */
  var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
    */
  var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  
  /**
    * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
    */
  var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.native
}
object TrainingJobStatusCounters {
  
  @scala.inline
  def apply(): TrainingJobStatusCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJobStatusCounters]
  }
  
  @scala.inline
  implicit class TrainingJobStatusCountersOps[Self <: TrainingJobStatusCounters] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: TrainingJobStatusCounter): Self = this.set("Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("Completed", js.undefined)
    
    @scala.inline
    def setInProgress(value: TrainingJobStatusCounter): Self = this.set("InProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInProgress: Self = this.set("InProgress", js.undefined)
    
    @scala.inline
    def setNonRetryableError(value: TrainingJobStatusCounter): Self = this.set("NonRetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonRetryableError: Self = this.set("NonRetryableError", js.undefined)
    
    @scala.inline
    def setRetryableError(value: TrainingJobStatusCounter): Self = this.set("RetryableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryableError: Self = this.set("RetryableError", js.undefined)
    
    @scala.inline
    def setStopped(value: TrainingJobStatusCounter): Self = this.set("Stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopped: Self = this.set("Stopped", js.undefined)
  }
}
