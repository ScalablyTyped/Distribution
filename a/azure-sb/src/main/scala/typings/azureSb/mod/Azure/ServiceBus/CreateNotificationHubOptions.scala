package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateNotificationHubOptions> */
@js.native
trait CreateNotificationHubOptions extends js.Object {
  var apns: js.UndefOr[Dictionary[String]] = js.native
  var gcm: js.UndefOr[Dictionary[String]] = js.native
  var mpns: js.UndefOr[Dictionary[String]] = js.native
  var wns: js.UndefOr[Dictionary[String]] = js.native
}

object CreateNotificationHubOptions {
  @scala.inline
  def apply(): CreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationHubOptions]
  }
  @scala.inline
  implicit class CreateNotificationHubOptionsOps[Self <: CreateNotificationHubOptions] (val x: Self) extends AnyVal {
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
    def deleteApns: Self = this.set("apns", js.undefined)
    @scala.inline
    def setGcm(value: Dictionary[String]): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcm: Self = this.set("gcm", js.undefined)
    @scala.inline
    def setMpns(value: Dictionary[String]): Self = this.set("mpns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpns: Self = this.set("mpns", js.undefined)
    @scala.inline
    def setWns(value: Dictionary[String]): Self = this.set("wns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWns: Self = this.set("wns", js.undefined)
  }
  
}

