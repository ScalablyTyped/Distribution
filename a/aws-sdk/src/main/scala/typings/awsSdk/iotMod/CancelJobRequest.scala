package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * An optional comment string describing why the job was canceled.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /**
    * (Optional) If true job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job executions with status "QUEUED" are canceled. The default is false. Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the job execution status. Use caution and ensure that each device executing a job which is canceled is able to recover to a valid state.
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  
  /**
    * (Optional)A reason code string that explains why the job was canceled.
    */
  var reasonCode: js.UndefOr[ReasonCode] = js.undefined
}
object CancelJobRequest {
  
  inline def apply(jobId: JobId): CancelJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  extension [Self <: CancelJobRequest](x: Self) {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setReasonCode(value: ReasonCode): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
