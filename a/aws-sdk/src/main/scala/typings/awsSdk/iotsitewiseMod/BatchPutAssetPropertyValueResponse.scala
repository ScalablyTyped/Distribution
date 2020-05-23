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
}

