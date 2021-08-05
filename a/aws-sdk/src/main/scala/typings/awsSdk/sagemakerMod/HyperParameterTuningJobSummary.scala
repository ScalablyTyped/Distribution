package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobSummary extends StObject {
  
  /**
    * The date and time that the tuning job was created.
    */
  var CreationTime: Timestamp
  
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typings.awsSdk.sagemakerMod.HyperParameterTuningJobArn
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsSdk.sagemakerMod.HyperParameterTuningJobName
  
  /**
    * The status of the tuning job.
    */
  var HyperParameterTuningJobStatus: typings.awsSdk.sagemakerMod.HyperParameterTuningJobStatus
  
  /**
    * The date and time that the tuning job was modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typings.awsSdk.sagemakerMod.ObjectiveStatusCounters
  
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
    */
  var ResourceLimits: js.UndefOr[typings.awsSdk.sagemakerMod.ResourceLimits] = js.undefined
  
  /**
    * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
    */
  var Strategy: HyperParameterTuningJobStrategyType
  
  /**
    * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typings.awsSdk.sagemakerMod.TrainingJobStatusCounters
}
object HyperParameterTuningJobSummary {
  
  inline def apply(
    CreationTime: Timestamp,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): HyperParameterTuningJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobSummary]
  }
  
  extension [Self <: HyperParameterTuningJobSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningEndTime(value: Timestamp): Self = StObject.set(x, "HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningEndTimeUndefined: Self = StObject.set(x, "HyperParameterTuningEndTime", js.undefined)
    
    inline def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = StObject.set(x, "HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = StObject.set(x, "ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    inline def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "ResourceLimits", value.asInstanceOf[js.Any])
    
    inline def setResourceLimitsUndefined: Self = StObject.set(x, "ResourceLimits", js.undefined)
    
    inline def setStrategy(value: HyperParameterTuningJobStrategyType): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = StObject.set(x, "TrainingJobStatusCounters", value.asInstanceOf[js.Any])
  }
}
