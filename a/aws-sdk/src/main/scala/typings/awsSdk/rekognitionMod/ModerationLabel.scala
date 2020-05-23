package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModerationLabel extends js.Object {
  /**
    * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified. If you don't specify the MinConfidence parameter in the call to DetectModerationLabels, the operation returns labels with a confidence value greater than or equal to 50 percent.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The label name for the type of unsafe content detected in the image.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The name for the parent label. Labels at the top level of the hierarchy have the parent label "".
    */
  var ParentName: js.UndefOr[String] = js.native
}

object ModerationLabel {
  @scala.inline
  def apply(Confidence: js.UndefOr[Percent] = js.undefined, Name: String = null, ParentName: String = null): ModerationLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ParentName != null) __obj.updateDynamic("ParentName")(ParentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModerationLabel]
  }
}

