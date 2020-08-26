package typings.c3.mod

import typings.c3.anon.Position
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisConfiguration extends js.Object {
  /**
    * Show the axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.native
  /**
    * Set label on axis.
    * Valid horizontal axis positions: inner-right (default), inner-center, inner-left, outer-right, outer-center, outer-left
    * Valid vertical axis positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
    */
  var label: js.UndefOr[String | Position] = js.native
  /**
    * Set max value of the axis.
    */
  var max: js.UndefOr[String | Double | Date] = js.native
  /**
    * Set min value of the axis.
    */
  var min: js.UndefOr[String | Double | Date] = js.native
  /**
    * Set padding for axis.
    * If this option is set, the range of axis will increase/decrease according to the values. If no padding is needed in the range of axis, `0` should be set. On category axis, this option
    * will be ignored.
    */
  var padding: js.UndefOr[Padding] = js.native
  /**
    * Show or hide the axis.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object AxisConfiguration {
  @scala.inline
  def apply(): AxisConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisConfiguration]
  }
  @scala.inline
  implicit class AxisConfigurationOps[Self <: AxisConfiguration] (val x: Self) extends AnyVal {
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
    def setInner(value: Boolean): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    @scala.inline
    def setLabel(value: String | Position): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMax(value: String | Double | Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String | Double | Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

