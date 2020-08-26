package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleNotification extends js.Object {
  var bt_payload: String = js.native
  var bt_signature: String = js.native
}

object SampleNotification {
  @scala.inline
  def apply(bt_payload: String, bt_signature: String): SampleNotification = {
    val __obj = js.Dynamic.literal(bt_payload = bt_payload.asInstanceOf[js.Any], bt_signature = bt_signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleNotification]
  }
  @scala.inline
  implicit class SampleNotificationOps[Self <: SampleNotification] (val x: Self) extends AnyVal {
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
    def setBt_payload(value: String): Self = this.set("bt_payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setBt_signature(value: String): Self = this.set("bt_signature", value.asInstanceOf[js.Any])
  }
  
}

