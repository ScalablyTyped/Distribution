package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatasetContentResponse extends js.Object {
  /**
    * A list of "DatasetEntry" objects.
    */
  var entries: js.UndefOr[DatasetEntries] = js.native
  /**
    * The status of the data set content.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  /**
    * The time when the request was made.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}

object GetDatasetContentResponse {
  @scala.inline
  def apply(): GetDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatasetContentResponse]
  }
  @scala.inline
  implicit class GetDatasetContentResponseOps[Self <: GetDatasetContentResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: DatasetEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: DatasetEntries): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setStatus(value: DatasetContentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

