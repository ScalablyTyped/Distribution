package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetContentRequest extends js.Object {
  /**
    * The name of the data set whose content is deleted.
    */
  var datasetName: DatasetName = js.native
  /**
    * The version of the data set whose content is deleted. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to delete the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}

object DeleteDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName): DeleteDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetContentRequest]
  }
  @scala.inline
  implicit class DeleteDatasetContentRequestOps[Self <: DeleteDatasetContentRequest] (val x: Self) extends AnyVal {
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
    def setDatasetName(value: DatasetName): Self = this.set("datasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: DatasetContentVersion): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

