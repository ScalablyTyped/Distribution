package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportLabelsTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
    */
  var InputS3Path: js.UndefOr[UriString] = js.native
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var Replace: js.UndefOr[ReplaceBoolean] = js.native
}

object ImportLabelsTaskRunProperties {
  @scala.inline
  def apply(InputS3Path: UriString = null, Replace: js.UndefOr[ReplaceBoolean] = js.undefined): ImportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    if (InputS3Path != null) __obj.updateDynamic("InputS3Path")(InputS3Path.asInstanceOf[js.Any])
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportLabelsTaskRunProperties]
  }
}

