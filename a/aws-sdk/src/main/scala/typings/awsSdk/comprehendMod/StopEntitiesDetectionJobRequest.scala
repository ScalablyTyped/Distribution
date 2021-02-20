package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopEntitiesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}
object StopEntitiesDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
  }
  
  @scala.inline
  implicit class StopEntitiesDetectionJobRequestMutableBuilder[Self <: StopEntitiesDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
