package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceRecord extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[typings.awsSdk.rekognitionMod.Face] = js.native
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[typings.awsSdk.rekognitionMod.FaceDetail] = js.native
}

object FaceRecord {
  @scala.inline
  def apply(Face: Face = null, FaceDetail: FaceDetail = null): FaceRecord = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (FaceDetail != null) __obj.updateDynamic("FaceDetail")(FaceDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceRecord]
  }
}

