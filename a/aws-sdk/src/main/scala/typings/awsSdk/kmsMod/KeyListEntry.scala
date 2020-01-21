package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyListEntry extends js.Object {
  /**
    * ARN of the key.
    */
  var KeyArn: js.UndefOr[ArnType] = js.native
  /**
    * Unique identifier of the key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object KeyListEntry {
  @scala.inline
  def apply(KeyArn: ArnType = null, KeyId: KeyIdType = null): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    if (KeyArn != null) __obj.updateDynamic("KeyArn")(KeyArn.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyListEntry]
  }
}

