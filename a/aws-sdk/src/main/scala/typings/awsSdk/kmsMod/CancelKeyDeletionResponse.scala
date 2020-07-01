package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelKeyDeletionResponse extends js.Object {
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object CancelKeyDeletionResponse {
  @scala.inline
  def apply(KeyId: KeyIdType = null): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
}

