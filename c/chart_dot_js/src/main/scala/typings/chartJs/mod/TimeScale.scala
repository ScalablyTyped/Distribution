package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeScale extends ChartScales {
  var displayFormats: js.UndefOr[TimeDisplayFormat] = js.native
  var isoWeekday: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
  var minUnit: js.UndefOr[TimeUnit] = js.native
  var parser: js.UndefOr[String | (js.Function1[/* arg */ js.Any, _])] = js.native
  var round: js.UndefOr[TimeUnit] = js.native
  var stepSize: js.UndefOr[Double] = js.native
  var tooltipFormat: js.UndefOr[String] = js.native
  var unit: js.UndefOr[TimeUnit] = js.native
  var unitStepSize: js.UndefOr[Double] = js.native
}

object TimeScale {
  @scala.inline
  def apply(): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeScale]
  }
  @scala.inline
  implicit class TimeScaleOps[Self <: TimeScale] (val x: Self) extends AnyVal {
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
    def setDisplayFormats(value: TimeDisplayFormat): Self = this.set("displayFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayFormats: Self = this.set("displayFormats", js.undefined)
    @scala.inline
    def setIsoWeekday(value: Boolean): Self = this.set("isoWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeekday: Self = this.set("isoWeekday", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinUnit(value: TimeUnit): Self = this.set("minUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinUnit: Self = this.set("minUnit", js.undefined)
    @scala.inline
    def setParserFunction1(value: /* arg */ js.Any => _): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def setParser(value: String | (js.Function1[/* arg */ js.Any, _])): Self = this.set("parser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setRound(value: TimeUnit): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSize: Self = this.set("stepSize", js.undefined)
    @scala.inline
    def setTooltipFormat(value: String): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
    @scala.inline
    def setUnit(value: TimeUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitStepSize(value: Double): Self = this.set("unitStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitStepSize: Self = this.set("unitStepSize", js.undefined)
  }
  
}

