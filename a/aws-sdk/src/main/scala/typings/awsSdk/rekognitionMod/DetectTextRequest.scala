package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectTextRequest extends js.Object {
  /**
    * Optional parameters that let you set the criteria that the text must meet to be included in your response.
    */
  var Filters: js.UndefOr[DetectTextFilters] = js.native
  /**
    * The input image as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Rekognition operations, you can't pass image bytes.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
}

object DetectTextRequest {
  @scala.inline
  def apply(Image: Image, Filters: DetectTextFilters = null): DetectTextRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectTextRequest]
  }
}

