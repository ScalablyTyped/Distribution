package typings.c3.mod

import typings.c3.anon.ExpandEnabled
import typings.c3.anon.R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptions extends js.Object {
  var focus: js.UndefOr[ExpandEnabled] = js.native
  /**
    * The radius size of each point.
    * Defaults to `2.5`. If it's a function, will call for each point.
    */
  var r: js.UndefOr[Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])] = js.native
  var select: js.UndefOr[R] = js.native
  /**
    * How sensitive is each point to mouse cursor hover.
    * Defaults to `10`.
    */
  var sensitivity: js.UndefOr[Double] = js.native
  /**
    * Whether to show each point in line.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object PointOptions {
  @scala.inline
  def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  @scala.inline
  implicit class PointOptionsOps[Self <: PointOptions] (val x: Self) extends AnyVal {
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
    def setFocus(value: ExpandEnabled): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setR(value: Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setSelect(value: R): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

