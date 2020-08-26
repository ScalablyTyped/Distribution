package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventSubscriptionMessage extends js.Object {
  /**
    * The name of the event notification subscription you want to delete.
    */
  var SubscriptionName: String = js.native
}

object DeleteEventSubscriptionMessage {
  @scala.inline
  def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
  @scala.inline
  implicit class DeleteEventSubscriptionMessageOps[Self <: DeleteEventSubscriptionMessage] (val x: Self) extends AnyVal {
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
    def setSubscriptionName(value: String): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
  }
  
}

