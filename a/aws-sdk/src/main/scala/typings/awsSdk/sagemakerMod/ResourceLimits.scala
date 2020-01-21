package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

