package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceDetection extends StObject {
  
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  
  /**
    * Time, in milliseconds from the start of the video, that the face was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.undefined
}
object FaceDetection {
  
  inline def apply(): FaceDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetection]
  }
  
  extension [Self <: FaceDetection](x: Self) {
    
    inline def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
