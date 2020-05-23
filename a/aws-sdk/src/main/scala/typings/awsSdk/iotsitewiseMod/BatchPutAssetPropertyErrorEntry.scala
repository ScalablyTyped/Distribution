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
}

