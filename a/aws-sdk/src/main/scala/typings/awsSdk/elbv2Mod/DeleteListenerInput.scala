package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteListenerInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.elbv2Mod.ListenerArn = js.native
}

object DeleteListenerInput {
  @scala.inline
  def apply(ListenerArn: ListenerArn): DeleteListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerInput]
  }
  @scala.inline
  implicit class DeleteListenerInputOps[Self <: DeleteListenerInput] (val x: Self) extends AnyVal {
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
    def setListenerArn(value: ListenerArn): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
  }
  
}

