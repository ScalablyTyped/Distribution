package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobStatusResult extends StObject {
  
  /**
    * The ID for the job whose status was updated.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
  
  /**
    * The current status for the specified job.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  
  /**
    * The reason that the specified job's status was updated.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}
object UpdateJobStatusResult {
  
  @scala.inline
  def apply(): UpdateJobStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobStatusResult]
  }
  
  @scala.inline
  implicit class UpdateJobStatusResultMutableBuilder[Self <: UpdateJobStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = StObject.set(x, "StatusUpdateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateReasonUndefined: Self = StObject.set(x, "StatusUpdateReason", js.undefined)
  }
}
