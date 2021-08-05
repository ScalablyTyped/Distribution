package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEntitiesDetectionV2JobRequest extends StObject {
  
  /**
    * The identifier of the medical entities job to stop.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId
}
object StopEntitiesDetectionV2JobRequest {
  
  inline def apply(JobId: JobId): StopEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionV2JobRequest]
  }
  
  extension [Self <: StopEntitiesDetectionV2JobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
