package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleChartClasses extends js.Object {
  var candleNegative: js.UndefOr[String] = js.native
  var candlePositive: js.UndefOr[String] = js.native
  var chart: js.UndefOr[String] = js.native
  var end: js.UndefOr[String] = js.native
  var grid: js.UndefOr[String] = js.native
  var gridBackground: js.UndefOr[String] = js.native
  var gridGroup: js.UndefOr[String] = js.native
  var horizontal: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var labelGroup: js.UndefOr[String] = js.native
  var series: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
  var vertical: js.UndefOr[String] = js.native
}

object ICandleChartClasses {
  @scala.inline
  def apply(): ICandleChartClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartClasses]
  }
  @scala.inline
  implicit class ICandleChartClassesOps[Self <: ICandleChartClasses] (val x: Self) extends AnyVal {
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
    def setCandleNegative(value: String): Self = this.set("candleNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandleNegative: Self = this.set("candleNegative", js.undefined)
    @scala.inline
    def setCandlePositive(value: String): Self = this.set("candlePositive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandlePositive: Self = this.set("candlePositive", js.undefined)
    @scala.inline
    def setChart(value: String): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setGrid(value: String): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setGridBackground(value: String): Self = this.set("gridBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridBackground: Self = this.set("gridBackground", js.undefined)
    @scala.inline
    def setGridGroup(value: String): Self = this.set("gridGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGroup: Self = this.set("gridGroup", js.undefined)
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelGroup(value: String): Self = this.set("labelGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelGroup: Self = this.set("labelGroup", js.undefined)
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

