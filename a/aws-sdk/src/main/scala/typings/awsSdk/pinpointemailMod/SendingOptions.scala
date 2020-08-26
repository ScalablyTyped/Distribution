package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendingOptions extends js.Object {
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object SendingOptions {
  @scala.inline
  def apply(): SendingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendingOptions]
  }
  @scala.inline
  implicit class SendingOptionsOps[Self <: SendingOptions] (val x: Self) extends AnyVal {
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
    def setSendingEnabled(value: Enabled): Self = this.set("SendingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendingEnabled: Self = this.set("SendingEnabled", js.undefined)
  }
  
}

