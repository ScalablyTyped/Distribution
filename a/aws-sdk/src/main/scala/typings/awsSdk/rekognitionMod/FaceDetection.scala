package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceDetection extends StObject {
  
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  
  /**
    * Time, in milliseconds from the start of the video, that the face was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}
object FaceDetection {
  
  @scala.inline
  def apply(): FaceDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetection]
  }
  
  @scala.inline
  implicit class FaceDetectionMutableBuilder[Self <: FaceDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
