package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTextTranslationJobRequest extends StObject {
  
  /**
    * The job ID of the job to be stopped.
    */
  var JobId: typings.awsSdk.clientsTranslateMod.JobId
}
object StopTextTranslationJobRequest {
  
  inline def apply(JobId: JobId): StopTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTextTranslationJobRequest]
  }
  
  extension [Self <: StopTextTranslationJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
