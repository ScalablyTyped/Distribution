package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoWindowOptions extends js.Object {
  var enableAutoPan: js.UndefOr[Boolean] = js.native
  var enableCloseOnClick: js.UndefOr[Boolean] = js.native
  var enableMessage: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Size] = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object InfoWindowOptions {
  @scala.inline
  def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
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
    def setEnableAutoPan(value: Boolean): Self = this.set("enableAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoPan: Self = this.set("enableAutoPan", js.undefined)
    @scala.inline
    def setEnableCloseOnClick(value: Boolean): Self = this.set("enableCloseOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCloseOnClick: Self = this.set("enableCloseOnClick", js.undefined)
    @scala.inline
    def setEnableMessage(value: Boolean): Self = this.set("enableMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMessage: Self = this.set("enableMessage", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

