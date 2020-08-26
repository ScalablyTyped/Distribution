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
  def apply(): WorkerBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerBlock]
  }
  @scala.inline
  implicit class WorkerBlockOps[Self <: WorkerBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
  
}

