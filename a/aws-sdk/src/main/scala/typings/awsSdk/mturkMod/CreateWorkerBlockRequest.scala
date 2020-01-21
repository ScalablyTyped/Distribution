package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkerBlockRequest extends js.Object {
  /**
    * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your Workers. The Worker does not see this message.
    */
  var Reason: String = js.native
  /**
    * The ID of the Worker to block.
    */
  var WorkerId: CustomerId = js.native
}

object CreateWorkerBlockRequest {
  @scala.inline
  def apply(Reason: String, WorkerId: CustomerId): CreateWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateWorkerBlockRequest]
  }
}

