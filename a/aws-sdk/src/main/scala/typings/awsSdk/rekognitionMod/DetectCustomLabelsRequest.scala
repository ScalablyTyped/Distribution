package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectCustomLabelsRequest extends js.Object {
  var Image: typings.awsSdk.rekognitionMod.Image = js.native
  /**
    * Maximum number of results you want the service to return in the response. The service returns the specified number of highest confidence labels ranked from highest confidence to lowest.
    */
  var MaxResults: js.UndefOr[UInteger] = js.native
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with a confidence lower than this specified value. If you specify a value of 0, all labels are return, regardless of the default thresholds that the model version applies.
    */
  var MinConfidence: js.UndefOr[Percent] = js.native
  /**
    * The ARN of the model version that you want to use.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}

object DetectCustomLabelsRequest {
  @scala.inline
  def apply(
    Image: Image,
    ProjectVersionArn: ProjectVersionArn,
    MaxResults: Int | Double = null,
    MinConfidence: Int | Double = null
  ): DetectCustomLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MinConfidence != null) __obj.updateDynamic("MinConfidence")(MinConfidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectCustomLabelsRequest]
  }
}

