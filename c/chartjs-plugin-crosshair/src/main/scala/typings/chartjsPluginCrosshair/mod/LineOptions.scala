package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var dashPattern: js.UndefOr[js.Array[Double]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LineOptions {
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  @scala.inline
  implicit class LineOptionsOps[Self <: LineOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashPatternVarargs(value: Double*): Self = this.set("dashPattern", js.Array(value :_*))
    @scala.inline
    def setDashPattern(value: js.Array[Double]): Self = this.set("dashPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashPattern: Self = this.set("dashPattern", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

