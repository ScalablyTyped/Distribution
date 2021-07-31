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
  
  @scala.inline
  def apply(): StartSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobResponse]
  }
  
  @scala.inline
  implicit class StartSigningJobResponseMutableBuilder[Self <: StartSigningJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
