package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits extends StObject {
  
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
  implicit class ResourceLimitsMutableBuilder[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNumberOfTrainingJobs(value: MaxNumberOfTrainingJobs): Self = StObject.set(x, "MaxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelTrainingJobs(value: MaxParallelTrainingJobs): Self = StObject.set(x, "MaxParallelTrainingJobs", value.asInstanceOf[js.Any])
  }
}
