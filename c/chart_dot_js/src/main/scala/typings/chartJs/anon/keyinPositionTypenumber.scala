package typings.chartJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in chart.js.chart.js.PositionType ]:? number} */
@js.native
trait keyinPositionTypenumber extends js.Object {
  var bottom: js.UndefOr[Double] = js.native
  var chartArea: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var right: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Double] = js.native
}

object keyinPositionTypenumber {
  @scala.inline
  def apply(): keyinPositionTypenumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinPositionTypenumber]
  }
  @scala.inline
  implicit class keyinPositionTypenumberOps[Self <: keyinPositionTypenumber] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setChartArea(value: Double): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

