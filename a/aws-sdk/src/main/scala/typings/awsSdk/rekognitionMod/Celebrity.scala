package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Celebrity extends js.Object {
  /**
    * Provides information about the celebrity's face, such as its location on the image.
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  /**
    * A unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.native
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
    */
  var MatchConfidence: js.UndefOr[Percent] = js.native
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of URLs pointing to additional information about the celebrity. If there is no additional information about the celebrity, this list is empty.
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.native
}

object Celebrity {
  @scala.inline
  def apply(
    Face: ComparedFace = null,
    Id: RekognitionUniqueId = null,
    MatchConfidence: Int | Double = null,
    Name: String = null,
    Urls: Urls = null
  ): Celebrity = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MatchConfidence != null) __obj.updateDynamic("MatchConfidence")(MatchConfidence.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Urls != null) __obj.updateDynamic("Urls")(Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Celebrity]
  }
}

