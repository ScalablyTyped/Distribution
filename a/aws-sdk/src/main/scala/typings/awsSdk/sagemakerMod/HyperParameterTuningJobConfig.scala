package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobConfig extends StObject {
  
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameterTuningJobObjective] = js.undefined
  
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: js.UndefOr[typings.awsSdk.sagemakerMod.ParameterRanges] = js.undefined
  
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: typings.awsSdk.sagemakerMod.ResourceLimits
  
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType
  
  /**
    * The configuration for the Hyperband optimization strategy. This parameter should be provided only if Hyperband is selected as the strategy for HyperParameterTuningJobConfig.
    */
  var StrategyConfig: js.UndefOr[HyperParameterTuningJobStrategyConfig] = js.undefined
  
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. Because the Hyperband strategy has its own advanced internal early stopping mechanism, TrainingJobEarlyStoppingType must be OFF to use Hyperband. This parameter can take on one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJobEarlyStoppingType] = js.undefined
  
  /**
    * The tuning job's completion criteria.
    */
  var TuningJobCompletionCriteria: js.UndefOr[typings.awsSdk.sagemakerMod.TuningJobCompletionCriteria] = js.undefined
}
object HyperParameterTuningJobConfig {
  
  inline def apply(ResourceLimits: ResourceLimits, Strategy: HyperParameterTuningJobStrategyType): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(ResourceLimits = ResourceLimits.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  extension [Self <: HyperParameterTuningJobConfig](x: Self) {
    
    inline def setHyperParameterTuningJobObjective(value: HyperParameterTuningJobObjective): Self = StObject.set(x, "HyperParameterTuningJobObjective", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobObjectiveUndefined: Self = StObject.set(x, "HyperParameterTuningJobObjective", js.undefined)
    
    inline def setParameterRanges(value: ParameterRanges): Self = StObject.set(x, "ParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setParameterRangesUndefined: Self = StObject.set(x, "ParameterRanges", js.undefined)
    
    inline def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "ResourceLimits", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: HyperParameterTuningJobStrategyType): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyConfig(value: HyperParameterTuningJobStrategyConfig): Self = StObject.set(x, "StrategyConfig", value.asInstanceOf[js.Any])
    
    inline def setStrategyConfigUndefined: Self = StObject.set(x, "StrategyConfig", js.undefined)
    
    inline def setTrainingJobEarlyStoppingType(value: TrainingJobEarlyStoppingType): Self = StObject.set(x, "TrainingJobEarlyStoppingType", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobEarlyStoppingTypeUndefined: Self = StObject.set(x, "TrainingJobEarlyStoppingType", js.undefined)
    
    inline def setTuningJobCompletionCriteria(value: TuningJobCompletionCriteria): Self = StObject.set(x, "TuningJobCompletionCriteria", value.asInstanceOf[js.Any])
    
    inline def setTuningJobCompletionCriteriaUndefined: Self = StObject.set(x, "TuningJobCompletionCriteria", js.undefined)
  }
}
