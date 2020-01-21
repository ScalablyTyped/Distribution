package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreStateError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object EnableFastSnapshotRestoreStateError {
  @scala.inline
  def apply(Code: String = null, Message: String = null): EnableFastSnapshotRestoreStateError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoreStateError]
  }
}

