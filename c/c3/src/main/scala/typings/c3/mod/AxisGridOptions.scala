package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisGridOptions extends js.Object {
  /**
    * Show additional grid lines along x axis.
    * If x axis is `category` axis, value can be category name. If x axis is `timeseries` axis, value can be date string, `Date` object and unixtime integer.
    */
  var lines: js.UndefOr[js.Array[GridLineOptions]] = js.native
  /**
    * Show grids along an axis.
    */
  var show: js.UndefOr[Boolean] = js.native
  /** Not used. */
  var `type`: js.UndefOr[String] = js.native
}

object AxisGridOptions {
  @scala.inline
  def apply(): AxisGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGridOptions]
  }
  @scala.inline
  implicit class AxisGridOptionsOps[Self <: AxisGridOptions] (val x: Self) extends AnyVal {
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
    def setLinesVarargs(value: GridLineOptions*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[GridLineOptions]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

