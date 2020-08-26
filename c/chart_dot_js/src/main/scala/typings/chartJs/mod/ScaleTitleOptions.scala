package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleTitleOptions extends js.Object {
  var display: js.UndefOr[Boolean] = js.native
  var fontColor: js.UndefOr[ChartColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var labelString: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double | String] = js.native
  var padding: js.UndefOr[ChartLayoutPaddingObject | Double] = js.native
}

object ScaleTitleOptions {
  @scala.inline
  def apply(): ScaleTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleTitleOptions]
  }
  @scala.inline
  implicit class ScaleTitleOptionsOps[Self <: ScaleTitleOptions] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFontColorVarargs(value: String*): Self = this.set("fontColor", js.Array(value :_*))
    @scala.inline
    def setFontColor(value: ChartColor): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setLabelString(value: String): Self = this.set("labelString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelString: Self = this.set("labelString", js.undefined)
    @scala.inline
    def setLineHeight(value: Double | String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setPadding(value: ChartLayoutPaddingObject | Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

