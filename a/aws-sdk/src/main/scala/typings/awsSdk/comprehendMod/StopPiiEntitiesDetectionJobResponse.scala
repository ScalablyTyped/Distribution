package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPiiEntitiesDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the PII entities detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendMod.JobId] = js.undefined
  
  /**
    * The status of the PII entities detection job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.undefined
}
object StopPiiEntitiesDetectionJobResponse {
  
  @scala.inline
  def apply(): StopPiiEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPiiEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit class StopPiiEntitiesDetectionJobResponseMutableBuilder[Self <: StopPiiEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
