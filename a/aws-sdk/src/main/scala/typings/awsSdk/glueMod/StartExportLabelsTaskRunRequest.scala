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
  @scala.inline
  implicit class StartExportLabelsTaskRunRequestOps[Self <: StartExportLabelsTaskRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutputS3Path(value: UriString): Self = this.set("OutputS3Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
  }
  
}

