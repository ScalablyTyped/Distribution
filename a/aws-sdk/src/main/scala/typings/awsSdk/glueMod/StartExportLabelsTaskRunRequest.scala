package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExportLabelsTaskRunRequest extends js.Object {
  /**
    * The Amazon S3 path where you export the labels.
    */
  var OutputS3Path: UriString = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object StartExportLabelsTaskRunRequest {
  @scala.inline
  def apply(OutputS3Path: UriString, TransformId: HashString): StartExportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportLabelsTaskRunRequest]
  }
}

