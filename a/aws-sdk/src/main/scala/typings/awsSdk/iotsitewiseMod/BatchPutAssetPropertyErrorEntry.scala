package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutAssetPropertyErrorEntry extends js.Object {
  /**
    * The ID of the failed entry.
    */
  var entryId: EntryId = js.native
  /**
    * The list of update property value errors.
    */
  var errors: BatchPutAssetPropertyErrors = js.native
}

object BatchPutAssetPropertyErrorEntry {
  @scala.inline
  def apply(entryId: EntryId, errors: BatchPutAssetPropertyErrors): BatchPutAssetPropertyErrorEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyErrorEntry]
  }
  @scala.inline
  implicit class BatchPutAssetPropertyErrorEntryOps[Self <: BatchPutAssetPropertyErrorEntry] (val x: Self) extends AnyVal {
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
    def setEntryId(value: EntryId): Self = this.set("entryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: BatchPutAssetPropertyError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchPutAssetPropertyErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

