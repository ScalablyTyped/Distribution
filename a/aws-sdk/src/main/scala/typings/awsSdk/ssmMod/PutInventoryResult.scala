package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInventoryResult extends js.Object {
  /**
    * Information about the request.
    */
  var Message: js.UndefOr[PutInventoryMessage] = js.native
}

object PutInventoryResult {
  @scala.inline
  def apply(Message: PutInventoryMessage = null): PutInventoryResult = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInventoryResult]
  }
}

