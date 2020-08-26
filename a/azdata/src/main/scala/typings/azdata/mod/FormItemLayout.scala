package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItemLayout extends js.Object {
  var componentHeight: js.UndefOr[Double | String] = js.native
  var componentWidth: js.UndefOr[Double | String] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var info: js.UndefOr[String] = js.native
  var titleFontSize: js.UndefOr[Double | String] = js.native
}

object FormItemLayout {
  @scala.inline
  def apply(): FormItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLayout]
  }
  @scala.inline
  implicit class FormItemLayoutOps[Self <: FormItemLayout] (val x: Self) extends AnyVal {
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
    def setComponentHeight(value: Double | String): Self = this.set("componentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentHeight: Self = this.set("componentHeight", js.undefined)
    @scala.inline
    def setComponentWidth(value: Double | String): Self = this.set("componentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentWidth: Self = this.set("componentWidth", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setTitleFontSize(value: Double | String): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
  }
  
}

