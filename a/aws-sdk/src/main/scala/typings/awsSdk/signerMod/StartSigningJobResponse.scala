package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSigningJobResponse extends StObject {
  
  /**
    * The ID of your signing job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}
object StartSigningJobResponse {
  
  inline def apply(): StartSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobResponse]
  }
  
  extension [Self <: StartSigningJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
