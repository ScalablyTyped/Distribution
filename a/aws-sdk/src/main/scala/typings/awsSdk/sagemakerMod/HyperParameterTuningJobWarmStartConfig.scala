package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTuningJobWarmStartConfig extends js.Object {
  
  /**
    * An array of hyperparameter tuning jobs that are used as the starting point for the new hyperparameter tuning job. For more information about warm starting a hyperparameter tuning job, see Using a Previous Hyperparameter Tuning Job as a Starting Point. Hyperparameter tuning jobs created before October 1, 2018 cannot be used as parent jobs for warm start tuning jobs.
    */
  var ParentHyperParameterTuningJobs: typings.awsSdk.sagemakerMod.ParentHyperParameterTuningJobs = js.native
  
  /**
    * Specifies one of the following:  IDENTICAL_DATA_AND_ALGORITHM  The new hyperparameter tuning job uses the same input data and training image as the parent tuning jobs. You can change the hyperparameter ranges to search and the maximum number of training jobs that the hyperparameter tuning job launches. You cannot use a new version of the training algorithm, unless the changes in the new version do not affect the algorithm itself. For example, changes that improve logging or adding support for a different data format are allowed. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  TRANSFER_LEARNING  The new hyperparameter tuning job can include input data, hyperparameter ranges, maximum number of concurrent training jobs, and maximum number of training jobs that are different than those of its parent hyperparameter tuning jobs. The training image can also be a different version from the version used in the parent hyperparameter tuning job. You can also change hyperparameters from tunable to static, and from static to tunable, but the total number of static plus tunable hyperparameters must remain the same as it is in all parent jobs. The objective metric for the new tuning job must be the same as for all parent jobs.  
    */
  var WarmStartType: HyperParameterTuningJobWarmStartType = js.native
}
object HyperParameterTuningJobWarmStartConfig {
  
  @scala.inline
  def apply(
    ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs,
    WarmStartType: HyperParameterTuningJobWarmStartType
  ): HyperParameterTuningJobWarmStartConfig = {
    val __obj = js.Dynamic.literal(ParentHyperParameterTuningJobs = ParentHyperParameterTuningJobs.asInstanceOf[js.Any], WarmStartType = WarmStartType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobWarmStartConfig]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobWarmStartConfigOps[Self <: HyperParameterTuningJobWarmStartConfig] (val x: Self) extends AnyVal {
    
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
    def setParentHyperParameterTuningJobsVarargs(value: ParentHyperParameterTuningJob*): Self = this.set("ParentHyperParameterTuningJobs", js.Array(value :_*))
    
    @scala.inline
    def setParentHyperParameterTuningJobs(value: ParentHyperParameterTuningJobs): Self = this.set("ParentHyperParameterTuningJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartType(value: HyperParameterTuningJobWarmStartType): Self = this.set("WarmStartType", value.asInstanceOf[js.Any])
  }
}
