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
  def apply(Image: Image): DetectModerationLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectModerationLabelsRequest]
  }
  @scala.inline
  implicit class DetectModerationLabelsRequestOps[Self <: DetectModerationLabelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: Image): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopConfig(value: HumanLoopConfig): Self = this.set("HumanLoopConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopConfig: Self = this.set("HumanLoopConfig", js.undefined)
    @scala.inline
    def setMinConfidence(value: Percent): Self = this.set("MinConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinConfidence: Self = this.set("MinConfidence", js.undefined)
  }
  
}

