package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateNotificationHubOptions extends js.Object {
  var apns: Dictionary[String] = js.native
  var gcm: Dictionary[String] = js.native
  var mpns: Dictionary[String] = js.native
  var wns: Dictionary[String] = js.native
}

object ICreateNotificationHubOptions {
  @scala.inline
  def apply(
    apns: Dictionary[String],
    gcm: Dictionary[String],
    mpns: Dictionary[String],
    wns: Dictionary[String]
  ): ICreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], wns = wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateNotificationHubOptions]
  }
  @scala.inline
  implicit class ICreateNotificationHubOptionsOps[Self <: ICreateNotificationHubOptions] (val x: Self) extends AnyVal {
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
    def setApns(value: Dictionary[String]): Self = this.set("apns", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcm(value: Dictionary[String]): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpns(value: Dictionary[String]): Self = this.set("mpns", value.asInstanceOf[js.Any])
    @scala.inline
    def setWns(value: Dictionary[String]): Self = this.set("wns", value.asInstanceOf[js.Any])
  }
  
}

