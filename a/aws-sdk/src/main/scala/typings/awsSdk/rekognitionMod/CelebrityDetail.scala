package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CelebrityDetail extends js.Object {
  /**
    * Bounding box around the body of a celebrity.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity. 
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Face details for the recognized celebrity.
    */
  var Face: js.UndefOr[FaceDetail] = js.native
  /**
    * The unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.native
}

object CelebrityDetail {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: Int | Double = null,
    Face: FaceDetail = null,
    Id: RekognitionUniqueId = null,
    Name: String = null,
    Urls: Urls = null
  ): CelebrityDetail = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Urls != null) __obj.updateDynamic("Urls")(Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CelebrityDetail]
  }
}

