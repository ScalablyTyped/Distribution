package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTuningJobConfig extends js.Object {
  
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameterTuningJobObjective] = js.native
  
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: js.UndefOr[typings.awsSdk.sagemakerMod.ParameterRanges] = js.native
  
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: typings.awsSdk.sagemakerMod.ResourceLimits = js.native
  
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. To use the Bayesian search strategy, set this to Bayesian. To randomly search, set it to Random. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobEarlyStoppingType] = js.native
  
  /**
    * The tuning job's completion criteria.
    */
  var TuningJobCompletionCriteria: js.UndefOr[typings.awsSdk.sagemakerMod.TuningJobCompletionCriteria] = js.native
}
object HyperParameterTuningJobConfig {
  
  @scala.inline
  def apply(ResourceLimits: ResourceLimits, Strategy: HyperParameterTuningJobStrategyType): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(ResourceLimits = ResourceLimits.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobConfigOps[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    
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
    def setResourceLimits(value: ResourceLimits): Self = this.set("ResourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: HyperParameterTuningJobStrategyType): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobObjective(value: HyperParameterTuningJobObjective): Self = this.set("HyperParameterTuningJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameterTuningJobObjective: Self = this.set("HyperParameterTuningJobObjective", js.undefined)
    
    @scala.inline
    def setParameterRanges(value: ParameterRanges): Self = this.set("ParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterRanges: Self = this.set("ParameterRanges", js.undefined)
    
    @scala.inline
    def setTrainingJobEarlyStoppingType(value: TrainingJobEarlyStoppingType): Self = this.set("TrainingJobEarlyStoppingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJobEarlyStoppingType: Self = this.set("TrainingJobEarlyStoppingType", js.undefined)
    
    @scala.inline
    def setTuningJobCompletionCriteria(value: TuningJobCompletionCriteria): Self = this.set("TuningJobCompletionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTuningJobCompletionCriteria: Self = this.set("TuningJobCompletionCriteria", js.undefined)
  }
}
