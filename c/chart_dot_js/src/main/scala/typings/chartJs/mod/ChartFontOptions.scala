package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFontOptions extends js.Object {
  var defaultFontColor: js.UndefOr[ChartColor] = js.native
  var defaultFontFamily: js.UndefOr[String] = js.native
  var defaultFontSize: js.UndefOr[Double] = js.native
  var defaultFontStyle: js.UndefOr[String] = js.native
}

object ChartFontOptions {
  @scala.inline
  def apply(): ChartFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontOptions]
  }
  @scala.inline
  implicit class ChartFontOptionsOps[Self <: ChartFontOptions] (val x: Self) extends AnyVal {
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
    def setDefaultFontColorVarargs(value: String*): Self = this.set("defaultFontColor", js.Array(value :_*))
    @scala.inline
    def setDefaultFontColor(value: ChartColor): Self = this.set("defaultFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontColor: Self = this.set("defaultFontColor", js.undefined)
    @scala.inline
    def setDefaultFontFamily(value: String): Self = this.set("defaultFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontFamily: Self = this.set("defaultFontFamily", js.undefined)
    @scala.inline
    def setDefaultFontSize(value: Double): Self = this.set("defaultFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontSize: Self = this.set("defaultFontSize", js.undefined)
    @scala.inline
    def setDefaultFontStyle(value: String): Self = this.set("defaultFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFontStyle: Self = this.set("defaultFontStyle", js.undefined)
  }
  
}

