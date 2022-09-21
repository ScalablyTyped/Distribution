package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchJobExecutionResponse extends StObject {
  
  /**
    * The identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The timestamp when the batch job execution ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for this batch job execution.
    */
  var executionId: Identifier
  
  /**
    * The unique identifier for this batch job.
    */
  var jobId: js.UndefOr[String100] = js.undefined
  
  /**
    * The name of this batch job.
    */
  var jobName: js.UndefOr[String100] = js.undefined
  
  /**
    * The type of job.
    */
  var jobType: js.UndefOr[BatchJobType] = js.undefined
  
  /**
    * The user for the job.
    */
  var jobUser: js.UndefOr[String100] = js.undefined
  
  /**
    * The timestamp when the batch job execution started.
    */
  var startTime: js.Date
  
  /**
    * The status of the batch job execution.
    */
  var status: BatchJobExecutionStatus
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object GetBatchJobExecutionResponse {
  
  inline def apply(
    applicationId: Identifier,
    executionId: Identifier,
    startTime: js.Date,
    status: BatchJobExecutionStatus
  ): GetBatchJobExecutionResponse = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], executionId = executionId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchJobExecutionResponse]
  }
  
  extension [Self <: GetBatchJobExecutionResponse](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExecutionId(value: Identifier): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String100): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobName(value: String100): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setJobType(value: BatchJobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setJobUser(value: String100): Self = StObject.set(x, "jobUser", value.asInstanceOf[js.Any])
    
    inline def setJobUserUndefined: Self = StObject.set(x, "jobUser", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BatchJobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
