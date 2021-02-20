package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopICD10CMInferenceJobRequest extends StObject {
  
  /**
    * The identifier of the job.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}
object StopICD10CMInferenceJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopICD10CMInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopICD10CMInferenceJobRequest]
  }
  
  @scala.inline
  implicit class StopICD10CMInferenceJobRequestMutableBuilder[Self <: StopICD10CMInferenceJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
