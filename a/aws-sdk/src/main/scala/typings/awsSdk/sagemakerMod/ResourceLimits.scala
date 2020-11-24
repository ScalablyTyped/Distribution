package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits extends js.Object {
  
  /**
    * The maximum number of training jobs that a hyperparameter tuning job can launch.
    */
  var MaxNumberOfTrainingJobs: typings.awsSdk.sagemakerMod.MaxNumberOfTrainingJobs = js.native
  
  /**
    * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
    */
  var MaxParallelTrainingJobs: typings.awsSdk.sagemakerMod.MaxParallelTrainingJobs = js.native
}
object ResourceLimits {
  
  @scala.inline
  def apply(MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs, MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
    val __obj = js.Dynamic.literal(MaxNumberOfTrainingJobs = MaxNumberOfTrainingJobs.asInstanceOf[js.Any], MaxParallelTrainingJobs = MaxParallelTrainingJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
  
  @scala.inline
  implicit class ResourceLimitsOps[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
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
    def setMaxNumberOfTrainingJobs(value: MaxNumberOfTrainingJobs): Self = this.set("MaxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelTrainingJobs(value: MaxParallelTrainingJobs): Self = this.set("MaxParallelTrainingJobs", value.asInstanceOf[js.Any])
  }
}
