package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchInferenceJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the batch inference job was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * If the batch inference job failed, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The name of the batch inference job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The time at which the batch inference job was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The ARN of the solution version used by the batch inference job.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the batch inference job. The status is one of the following values:   PENDING   IN PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object BatchInferenceJobSummary {
  
  inline def apply(): BatchInferenceJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchInferenceJobSummary]
  }
  
  extension [Self <: BatchInferenceJobSummary](x: Self) {
    
    inline def setBatchInferenceJobArn(value: Arn): Self = StObject.set(x, "batchInferenceJobArn", value.asInstanceOf[js.Any])
    
    inline def setBatchInferenceJobArnUndefined: Self = StObject.set(x, "batchInferenceJobArn", js.undefined)
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
