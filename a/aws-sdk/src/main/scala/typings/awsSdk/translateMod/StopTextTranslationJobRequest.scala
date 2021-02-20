package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTextTranslationJobRequest extends StObject {
  
  /**
    * The job ID of the job to be stopped.
    */
  var JobId: typings.awsSdk.translateMod.JobId = js.native
}
object StopTextTranslationJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): StopTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTextTranslationJobRequest]
  }
  
  @scala.inline
  implicit class StopTextTranslationJobRequestMutableBuilder[Self <: StopTextTranslationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
