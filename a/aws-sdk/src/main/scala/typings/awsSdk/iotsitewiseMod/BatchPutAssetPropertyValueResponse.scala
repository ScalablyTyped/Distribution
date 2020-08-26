package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutAssetPropertyValueResponse extends js.Object {
  /**
    * A list of the errors (if any) associated with the batch put request. Each error entry contains the entryId of the entry that failed.
    */
  var errorEntries: BatchPutAssetPropertyErrorEntries = js.native
}

object BatchPutAssetPropertyValueResponse {
  @scala.inline
  def apply(errorEntries: BatchPutAssetPropertyErrorEntries): BatchPutAssetPropertyValueResponse = {
    val __obj = js.Dynamic.literal(errorEntries = errorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueResponse]
  }
  @scala.inline
  implicit class BatchPutAssetPropertyValueResponseOps[Self <: BatchPutAssetPropertyValueResponse] (val x: Self) extends AnyVal {
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
    def setErrorEntriesVarargs(value: BatchPutAssetPropertyErrorEntry*): Self = this.set("errorEntries", js.Array(value :_*))
    @scala.inline
    def setErrorEntries(value: BatchPutAssetPropertyErrorEntries): Self = this.set("errorEntries", value.asInstanceOf[js.Any])
  }
  
}

