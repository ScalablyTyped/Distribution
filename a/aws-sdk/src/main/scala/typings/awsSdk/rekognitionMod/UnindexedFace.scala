package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnindexedFace extends js.Object {
  
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
  implicit class UnindexedFaceOps[Self <: UnindexedFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFaceDetail(value: FaceDetail): Self = this.set("FaceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceDetail: Self = this.set("FaceDetail", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: Reason*): Self = this.set("Reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: Reasons): Self = this.set("Reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasons: Self = this.set("Reasons", js.undefined)
  }
}
