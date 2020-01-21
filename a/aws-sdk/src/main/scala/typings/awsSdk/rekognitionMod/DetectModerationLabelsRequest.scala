package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectModerationLabelsRequest extends js.Object {
  /**
    * Sets up the configuration for human evaluation, including the FlowDefinition the image will be sent to.
    */
  var HumanLoopConfig: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopConfig] = js.native
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with a confidence level lower than this specified value. If you don't specify MinConfidence, the operation returns labels with confidence values greater than or equal to 50 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
}

object DetectModerationLabelsRequest {
  @scala.inline
  def apply(Image: Image, HumanLoopConfig: HumanLoopConfig = null, MinConfidence: Int | Double = null): DetectModerationLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    if (HumanLoopConfig != null) __obj.updateDynamic("HumanLoopConfig")(HumanLoopConfig.asInstanceOf[js.Any])
    if (MinConfidence != null) __obj.updateDynamic("MinConfidence")(MinConfidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectModerationLabelsRequest]
  }
}

