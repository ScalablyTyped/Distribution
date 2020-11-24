package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLJobCompletionCriteria extends js.Object {
  
  /**
    * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or greater than MaxRuntimePerTrainingJobInSeconds.
    */
  var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxAutoMLJobRuntimeInSeconds] = js.native
  
  /**
    * The maximum number of times a training job is allowed to run.
    */
  var MaxCandidates: js.UndefOr[typings.awsSdk.sagemakerMod.MaxCandidates] = js.native
  
  /**
    * The maximum time, in seconds, a job is allowed to run.
    */
  var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimePerTrainingJobInSeconds] = js.native
}
object AutoMLJobCompletionCriteria {
  
  @scala.inline
  def apply(): AutoMLJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobCompletionCriteria]
  }
  
  @scala.inline
  implicit class AutoMLJobCompletionCriteriaOps[Self <: AutoMLJobCompletionCriteria] (val x: Self) extends AnyVal {
    
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
    def setMaxAutoMLJobRuntimeInSeconds(value: MaxAutoMLJobRuntimeInSeconds): Self = this.set("MaxAutoMLJobRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAutoMLJobRuntimeInSeconds: Self = this.set("MaxAutoMLJobRuntimeInSeconds", js.undefined)
    
    @scala.inline
    def setMaxCandidates(value: MaxCandidates): Self = this.set("MaxCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCandidates: Self = this.set("MaxCandidates", js.undefined)
    
    @scala.inline
    def setMaxRuntimePerTrainingJobInSeconds(value: MaxRuntimePerTrainingJobInSeconds): Self = this.set("MaxRuntimePerTrainingJobInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRuntimePerTrainingJobInSeconds: Self = this.set("MaxRuntimePerTrainingJobInSeconds", js.undefined)
  }
}
