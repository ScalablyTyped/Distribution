package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerBlock extends js.Object {
  /**
    *  A message explaining the reason the Worker was blocked. 
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object WorkerBlock {
  @scala.inline
  def apply(Reason: String = null, WorkerId: CustomerId = null): WorkerBlock = {
    val __obj = js.Dynamic.literal()
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerBlock]
  }
}

