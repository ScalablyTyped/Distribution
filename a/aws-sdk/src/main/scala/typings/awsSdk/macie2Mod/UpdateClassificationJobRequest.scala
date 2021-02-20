package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClassificationJobRequest extends StObject {
  
  /**
    * The unique identifier for the classification job.
    */
  var jobId: string = js.native
  
  /**
    * The new status for the job. Valid values are: CANCELLED - Stops the job permanently and cancels it. You can't resume a job after you cancel it. This value is valid only if the job's current status is IDLE, PAUSED, RUNNING, or USER_PAUSED. RUNNING - Resumes the job. This value is valid only if the job's current status is USER_PAUSED. If you specify this value, Amazon Macie immediately resumes processing from the point where you paused the job. Otherwise, Macie resumes the job according to the schedule and other configuration settings for the job. USER_PAUSED - Pauses the job. This value is valid only if the job's current status is IDLE or RUNNING. If you specify this value and the job's current status is RUNNING, Macie immediately begins to pause all processing tasks for the job. If you pause a job when its status is RUNNING and you don't resume the job within 30 days, the job expires and Macie cancels it. You can't resume a job after it's cancelled.
    */
  var jobStatus: JobStatus = js.native
}
object UpdateClassificationJobRequest {
  
  @scala.inline
  def apply(jobId: string, jobStatus: JobStatus): UpdateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassificationJobRequest]
  }
  
  @scala.inline
  implicit class UpdateClassificationJobRequestMutableBuilder[Self <: UpdateClassificationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
  }
}
