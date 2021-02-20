package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopPiiEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the PII entities detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}
object StopPiiEntitiesDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopPiiEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPiiEntitiesDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StopPiiEntitiesDetectionJobRequestMutableBuilder[Self <: StopPiiEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
