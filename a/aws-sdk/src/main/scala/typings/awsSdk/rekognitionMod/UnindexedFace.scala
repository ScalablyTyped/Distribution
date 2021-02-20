package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnindexedFace extends StObject {
  
  /**
    * The structure that contains attributes of a face that IndexFacesdetected, but didn't index. 
    */
  var FaceDetail: js.UndefOr[typings.awsSdk.rekognitionMod.FaceDetail] = js.native
  
  /**
    * An array of reasons that specify why a face wasn't indexed.    EXTREME_POSE - The face is at a pose that can't be detected. For example, the head is turned too far away from the camera.   EXCEEDS_MAX_FACES - The number of faces detected is already higher than that specified by the MaxFaces input parameter for IndexFaces.   LOW_BRIGHTNESS - The image is too dark.   LOW_SHARPNESS - The image is too blurry.   LOW_CONFIDENCE - The face was detected with a low confidence.   SMALL_BOUNDING_BOX - The bounding box around the face is too small.  
    */
  var Reasons: js.UndefOr[typings.awsSdk.rekognitionMod.Reasons] = js.native
}
object UnindexedFace {
  
  @scala.inline
  def apply(): UnindexedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnindexedFace]
  }
  
  @scala.inline
  implicit class UnindexedFaceMutableBuilder[Self <: UnindexedFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceDetail(value: FaceDetail): Self = StObject.set(x, "FaceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetailUndefined: Self = StObject.set(x, "FaceDetail", js.undefined)
    
    @scala.inline
    def setReasons(value: Reasons): Self = StObject.set(x, "Reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsUndefined: Self = StObject.set(x, "Reasons", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: Reason*): Self = StObject.set(x, "Reasons", js.Array(value :_*))
  }
}
