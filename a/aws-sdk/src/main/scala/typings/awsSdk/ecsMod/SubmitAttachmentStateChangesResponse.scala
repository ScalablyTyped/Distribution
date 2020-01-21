package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitAttachmentStateChangesResponse extends js.Object {
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.native
}

object SubmitAttachmentStateChangesResponse {
  @scala.inline
  def apply(acknowledgment: String = null): SubmitAttachmentStateChangesResponse = {
    val __obj = js.Dynamic.literal()
    if (acknowledgment != null) __obj.updateDynamic("acknowledgment")(acknowledgment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitAttachmentStateChangesResponse]
  }
}

