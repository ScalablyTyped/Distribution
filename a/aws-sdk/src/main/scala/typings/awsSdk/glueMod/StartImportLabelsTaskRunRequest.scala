package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportLabelsTaskRunRequest extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
    */
  var InputS3Path: UriString = js.native
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object StartImportLabelsTaskRunRequest {
  @scala.inline
  def apply(
    InputS3Path: UriString,
    TransformId: HashString,
    ReplaceAllLabels: js.UndefOr[scala.Boolean] = js.undefined
  ): StartImportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(InputS3Path = InputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplaceAllLabels)) __obj.updateDynamic("ReplaceAllLabels")(ReplaceAllLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
  }
}

