package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectTextResponse extends js.Object {
  /**
    * An array of text that was detected in the input image.
    */
  var TextDetections: js.UndefOr[TextDetectionList] = js.native
  /**
    * The model version used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
}

object DetectTextResponse {
  @scala.inline
  def apply(TextDetections: TextDetectionList = null, TextModelVersion: String = null): DetectTextResponse = {
    val __obj = js.Dynamic.literal()
    if (TextDetections != null) __obj.updateDynamic("TextDetections")(TextDetections.asInstanceOf[js.Any])
    if (TextModelVersion != null) __obj.updateDynamic("TextModelVersion")(TextModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectTextResponse]
  }
}

