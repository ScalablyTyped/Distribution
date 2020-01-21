package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectCustomLabelsResponse extends js.Object {
  /**
    * An array of custom labels detected in the input image.
    */
  var CustomLabels: js.UndefOr[typings.awsSdk.rekognitionMod.CustomLabels] = js.native
}

object DetectCustomLabelsResponse {
  @scala.inline
  def apply(CustomLabels: CustomLabels = null): DetectCustomLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomLabels != null) __obj.updateDynamic("CustomLabels")(CustomLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectCustomLabelsResponse]
  }
}

