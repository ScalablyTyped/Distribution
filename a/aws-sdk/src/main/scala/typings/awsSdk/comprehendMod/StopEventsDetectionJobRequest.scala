package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEventsDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the events detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId
}
object StopEventsDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopEventsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEventsDetectionJobRequest]
  }
  
  extension [Self <: StopEventsDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
