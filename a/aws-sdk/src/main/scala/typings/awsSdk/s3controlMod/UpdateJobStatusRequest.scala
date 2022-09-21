package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobStatusRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the S3 Batch Operations job.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId
  
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: typings.awsSdk.s3controlMod.RequestedJobStatus
  
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.undefined
}
object UpdateJobStatusRequest {
  
  inline def apply(AccountId: AccountId, JobId: JobId, RequestedJobStatus: RequestedJobStatus): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
  
  extension [Self <: UpdateJobStatusRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setRequestedJobStatus(value: RequestedJobStatus): Self = StObject.set(x, "RequestedJobStatus", value.asInstanceOf[js.Any])
    
    inline def setStatusUpdateReason(value: JobStatusUpdateReason): Self = StObject.set(x, "StatusUpdateReason", value.asInstanceOf[js.Any])
    
    inline def setStatusUpdateReasonUndefined: Self = StObject.set(x, "StatusUpdateReason", js.undefined)
  }
}
