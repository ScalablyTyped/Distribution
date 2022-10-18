package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTextTranslationJobResponse extends StObject {
  
  /**
    * The job ID of the stopped batch translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsTranslateMod.JobId] = js.undefined
  
  /**
    * The status of the designated job. Upon successful completion, the job's status will be STOPPED.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsTranslateMod.JobStatus] = js.undefined
}
object StopTextTranslationJobResponse {
  
  inline def apply(): StopTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTextTranslationJobResponse]
  }
  
  extension [Self <: StopTextTranslationJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
