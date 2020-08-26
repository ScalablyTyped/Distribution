package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueReference extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.native
}

object QueueReference {
  @scala.inline
  def apply(): QueueReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueReference]
  }
  @scala.inline
  implicit class QueueReferenceOps[Self <: QueueReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: ARN): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setId(value: QueueId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

