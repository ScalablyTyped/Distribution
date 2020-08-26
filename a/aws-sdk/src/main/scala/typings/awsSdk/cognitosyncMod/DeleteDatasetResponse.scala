package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetResponse extends js.Object {
  /**
    * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
    */
  var Dataset: js.UndefOr[typings.awsSdk.cognitosyncMod.Dataset] = js.native
}

object DeleteDatasetResponse {
  @scala.inline
  def apply(): DeleteDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDatasetResponse]
  }
  @scala.inline
  implicit class DeleteDatasetResponseOps[Self <: DeleteDatasetResponse] (val x: Self) extends AnyVal {
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
    def setDataset(value: Dataset): Self = this.set("Dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("Dataset", js.undefined)
  }
  
}

