package typings.chartist.mod

import typings.chartist.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleChartAxis extends js.Object {
  /**
    * Interpolation function that allows you to intercept the value from the axis label
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  /**
    * Allows you to correct label positioning on this axis by positive or negative x and y offset.
    */
  var labelOffset: js.UndefOr[Y] = js.native
  /**
    * The offset of the chart drawing area to the border of the container
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Position where labels are placed. Can be set to `start` or `end` where `start` is equivalent to left or top on vertical axis and `end` is equivalent to right or bottom on horizontal axis.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * If the axis grid should be drawn or not
    */
  var showGrid: js.UndefOr[Boolean] = js.native
  /**
    * If labels should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  /**
    * Set the axis type to be used to project values on this axis. If not defined, Chartist.StepAxis will be used for the X-Axis, where the ticks option will be set to the labels in the data and the stretch option will be set to the global fullWidth option. This type can be changed to any axis constructor available (e.g. Chartist.FixedScaleAxis), where all axis options should be present here.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object ICandleChartAxis {
  @scala.inline
  def apply(): ICandleChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartAxis]
  }
  @scala.inline
  implicit class ICandleChartAxisOps[Self <: ICandleChartAxis] (val x: Self) extends AnyVal {
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
    def setLabelInterpolationFnc(value: js.Function): Self = this.set("labelInterpolationFnc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInterpolationFnc: Self = this.set("labelInterpolationFnc", js.undefined)
    @scala.inline
    def setLabelOffset(value: Y): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

