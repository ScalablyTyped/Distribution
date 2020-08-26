package typings.bootstrapToggle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapToggleOptions extends js.Object {
  var height: js.UndefOr[Double | String | Null] = js.native
  var off: js.UndefOr[String] = js.native
  var offstyle: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
  var onstyle: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var style: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String | Null] = js.native
}

object BootstrapToggleOptions {
  @scala.inline
  def apply(): BootstrapToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapToggleOptions]
  }
  @scala.inline
  implicit class BootstrapToggleOptionsOps[Self <: BootstrapToggleOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    @scala.inline
    def setOff(value: String): Self = this.set("off", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    @scala.inline
    def setOffstyle(value: String): Self = this.set("offstyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffstyle: Self = this.set("offstyle", js.undefined)
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnstyle(value: String): Self = this.set("onstyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnstyle: Self = this.set("onstyle", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
  
}

