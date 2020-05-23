package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutAssetPropertyValueRequest extends js.Object {
  /**
    * The list of asset property value entries for the batch put request. You can specify up to 10 entries per request.
    */
  var entries: PutAssetPropertyValueEntries = js.native
}

object BatchPutAssetPropertyValueRequest {
  @scala.inline
  def apply(entries: PutAssetPropertyValueEntries): BatchPutAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueRequest]
  }
}

