package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExecutionStep extends StObject {
  
  /**
    * The current attempt of the execution step. For more information, see Retry Policy for SageMaker Pipelines steps.
    */
  var AttemptCount: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * If this pipeline execution step was cached, details on the cache hit.
    */
  var CacheHitResult: js.UndefOr[typings.awsSdk.sagemakerMod.CacheHitResult] = js.undefined
  
  /**
    * The time that the step stopped executing.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason why the step failed execution. This is only returned if the step failed its execution.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * Metadata for the step execution.
    */
  var Metadata: js.UndefOr[PipelineExecutionStepMetadata] = js.undefined
  
  /**
    * The time that the step started executing.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the step.
    */
  var StepDescription: js.UndefOr[typings.awsSdk.sagemakerMod.StepDescription] = js.undefined
  
  /**
    * The display name of the step.
    */
  var StepDisplayName: js.UndefOr[typings.awsSdk.sagemakerMod.StepDisplayName] = js.undefined
  
  /**
    * The name of the step that is executed.
    */
  var StepName: js.UndefOr[typings.awsSdk.sagemakerMod.StepName] = js.undefined
  
  /**
    * The status of the step execution.
    */
  var StepStatus: js.UndefOr[typings.awsSdk.sagemakerMod.StepStatus] = js.undefined
}
object PipelineExecutionStep {
  
  inline def apply(): PipelineExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecutionStep]
  }
  
  extension [Self <: PipelineExecutionStep](x: Self) {
    
    inline def setAttemptCount(value: IntegerValue): Self = StObject.set(x, "AttemptCount", value.asInstanceOf[js.Any])
    
    inline def setAttemptCountUndefined: Self = StObject.set(x, "AttemptCount", js.undefined)
    
    inline def setCacheHitResult(value: CacheHitResult): Self = StObject.set(x, "CacheHitResult", value.asInstanceOf[js.Any])
    
    inline def setCacheHitResultUndefined: Self = StObject.set(x, "CacheHitResult", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setMetadata(value: PipelineExecutionStepMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStepDescription(value: StepDescription): Self = StObject.set(x, "StepDescription", value.asInstanceOf[js.Any])
    
    inline def setStepDescriptionUndefined: Self = StObject.set(x, "StepDescription", js.undefined)
    
    inline def setStepDisplayName(value: StepDisplayName): Self = StObject.set(x, "StepDisplayName", value.asInstanceOf[js.Any])
    
    inline def setStepDisplayNameUndefined: Self = StObject.set(x, "StepDisplayName", js.undefined)
    
    inline def setStepName(value: StepName): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
    
    inline def setStepStatus(value: StepStatus): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    inline def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
  }
}
