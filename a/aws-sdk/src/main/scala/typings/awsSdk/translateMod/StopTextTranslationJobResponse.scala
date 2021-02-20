package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTextTranslationJobResponse extends StObject {
  
  /**
    * The job ID of the stopped batch translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.native
  
  /**
    * The status of the designated job. Upon successful completion, the job's status will be STOPPED.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
}
object StopTextTranslationJobResponse {
  
  @scala.inline
  def apply(): StopTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTextTranslationJobResponse]
  }
  
  @scala.inline
  implicit class StopTextTranslationJobResponseMutableBuilder[Self <: StopTextTranslationJobResponse] (val x: Self) extends AnyVal {
    
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
