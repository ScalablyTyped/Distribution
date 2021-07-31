package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEntitiesDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendMod.JobId] = js.undefined
  
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopEntitiesDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.undefined
}
object StopEntitiesDetectionJobResponse {
  
  @scala.inline
  def apply(): StopEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit class StopEntitiesDetectionJobResponseMutableBuilder[Self <: StopEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
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
