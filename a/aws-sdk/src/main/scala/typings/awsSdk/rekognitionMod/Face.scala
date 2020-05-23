package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Face extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ExternalImageId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typings.awsSdk.rekognitionMod.FaceId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ImageId] = js.native
}

object Face {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: js.UndefOr[Percent] = js.undefined,
    ExternalImageId: ExternalImageId = null,
    FaceId: FaceId = null,
    ImageId: ImageId = null
  ): Face = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (ExternalImageId != null) __obj.updateDynamic("ExternalImageId")(ExternalImageId.asInstanceOf[js.Any])
    if (FaceId != null) __obj.updateDynamic("FaceId")(FaceId.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
}

