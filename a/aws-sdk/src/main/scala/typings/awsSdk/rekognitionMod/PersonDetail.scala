package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonDetail extends js.Object {
  /**
    * Bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Face details for the detected person.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * Identifier for the person detected person within a video. Use to keep track of the person throughout the video. The identifier is not stored by Amazon Rekognition.
    */
  var Index: js.UndefOr[PersonIndex] = js.native
}

object PersonDetail {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Face: FaceDetail = null, Index: Int | Double = null): PersonDetail = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonDetail]
  }
}

