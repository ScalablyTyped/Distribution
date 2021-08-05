package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopKeyPhrasesDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId
}
object StopKeyPhrasesDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
  }
  
  extension [Self <: StopKeyPhrasesDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
