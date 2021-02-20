package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPersonTrackingResponse extends StObject {
  
  /**
    * The identifier for the person detection job. Use JobId to identify the job in a subsequent call to GetPersonTracking.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}
object StartPersonTrackingResponse {
  
  @scala.inline
  def apply(): StartPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPersonTrackingResponse]
  }
  
  @scala.inline
  implicit class StartPersonTrackingResponseMutableBuilder[Self <: StartPersonTrackingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
