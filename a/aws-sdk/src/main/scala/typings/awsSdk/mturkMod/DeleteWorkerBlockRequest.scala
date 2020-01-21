package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkerBlockRequest extends js.Object {
  /**
    * A message that explains the reason for unblocking the Worker. The Worker does not see this message.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker to unblock.
    */
  var WorkerId: CustomerId = js.native
}

object DeleteWorkerBlockRequest {
  @scala.inline
  def apply(WorkerId: CustomerId, Reason: String = null): DeleteWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(WorkerId = WorkerId.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkerBlockRequest]
  }
}

