package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparedSourceImageFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the selected bounding box contains a face.
    */
  var Confidence: js.UndefOr[Percent] = js.native
}

object ComparedSourceImageFace {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Confidence: Int | Double = null): ComparedSourceImageFace = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparedSourceImageFace]
  }
}

