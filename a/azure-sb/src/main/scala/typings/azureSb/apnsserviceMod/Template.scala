package typings.azureSb.apnsserviceMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  expiry :std.Date,   aps :object,   badge :number,   alert :string,   sound :string,   payload :object}> */
@js.native
trait Template extends js.Object {
  var alert: js.UndefOr[String] = js.native
  var aps: js.UndefOr[js.Object] = js.native
  var badge: js.UndefOr[Double] = js.native
  var expiry: js.UndefOr[Date] = js.native
  var payload: js.UndefOr[js.Object] = js.native
  var sound: js.UndefOr[String] = js.native
}

object Template {
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setAlert(value: String): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setAps(value: js.Object): Self = this.set("aps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAps: Self = this.set("aps", js.undefined)
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setExpiry(value: Date): Self = this.set("expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    @scala.inline
    def setPayload(value: js.Object): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
  }
  
}

