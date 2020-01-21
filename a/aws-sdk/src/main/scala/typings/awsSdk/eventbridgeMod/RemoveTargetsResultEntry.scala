package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTargetsResultEntry extends js.Object {
  /**
    * The error code that indicates why the target removal failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.eventbridgeMod.ErrorCode] = js.native
  /**
    * The error message that explains why the target removal failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.eventbridgeMod.ErrorMessage] = js.native
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typings.awsSdk.eventbridgeMod.TargetId] = js.native
}

object RemoveTargetsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, TargetId: TargetId = null): RemoveTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsResultEntry]
  }
}

