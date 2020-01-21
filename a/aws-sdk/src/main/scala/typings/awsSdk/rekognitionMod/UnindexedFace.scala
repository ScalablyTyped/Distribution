package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(FaceDetail: FaceDetail = null, Reasons: Reasons = null): UnindexedFace = {
    val __obj = js.Dynamic.literal()
    if (FaceDetail != null) __obj.updateDynamic("FaceDetail")(FaceDetail.asInstanceOf[js.Any])
    if (Reasons != null) __obj.updateDynamic("Reasons")(Reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnindexedFace]
  }
}

