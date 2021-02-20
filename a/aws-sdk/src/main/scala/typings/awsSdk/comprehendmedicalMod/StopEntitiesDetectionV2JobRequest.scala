package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopEntitiesDetectionV2JobRequest extends StObject {
  
  /**
    * The identifier of the medical entities job to stop.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}
object StopEntitiesDetectionV2JobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionV2JobRequest]
  }
  
  @scala.inline
  implicit class StopEntitiesDetectionV2JobRequestMutableBuilder[Self <: StopEntitiesDetectionV2JobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
