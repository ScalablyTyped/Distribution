package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFaceDetectionResponse extends StObject {
  
  /**
    * The identifier for the face detection job. Use JobId to identify the job in a subsequent call to GetFaceDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.rekognitionMod.JobId] = js.native
}
object StartFaceDetectionResponse {
  
  @scala.inline
  def apply(): StartFaceDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFaceDetectionResponse]
  }
  
  @scala.inline
  implicit class StartFaceDetectionResponseMutableBuilder[Self <: StartFaceDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
