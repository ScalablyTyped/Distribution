package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonAxe extends js.Object {
  var afterBuildTicks: js.UndefOr[js.Function2[/* scale */ js.Any, /* ticks */ js.Array[Double], js.Array[Double]]] = js.native
  var afterCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var afterUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  var bounds: js.UndefOr[String] = js.native
  var display: js.UndefOr[Boolean | String] = js.native
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  var id: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  var stacked: js.UndefOr[Boolean] = js.native
  var ticks: js.UndefOr[TickOptions] = js.native
  var time: js.UndefOr[TimeScale] = js.native
  var `type`: js.UndefOr[ScaleType | String] = js.native
}

object CommonAxe {
  @scala.inline
  def apply(): CommonAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonAxe]
  }
  @scala.inline
  implicit class CommonAxeOps[Self <: CommonAxe] (val x: Self) extends AnyVal {
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
    def setAfterBuildTicks(value: (/* scale */ js.Any, /* ticks */ js.Array[Double]) => js.Array[Double]): Self = this.set("afterBuildTicks", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterBuildTicks: Self = this.set("afterBuildTicks", js.undefined)
    @scala.inline
    def setAfterCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterCalculateTickRotation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterCalculateTickRotation: Self = this.set("afterCalculateTickRotation", js.undefined)
    @scala.inline
    def setAfterDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterDataLimits", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDataLimits: Self = this.set("afterDataLimits", js.undefined)
    @scala.inline
    def setAfterFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterFit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterFit: Self = this.set("afterFit", js.undefined)
    @scala.inline
    def setAfterSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterSetDimension", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterSetDimension: Self = this.set("afterSetDimension", js.undefined)
    @scala.inline
    def setAfterTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterTickToLabelConversion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterTickToLabelConversion: Self = this.set("afterTickToLabelConversion", js.undefined)
    @scala.inline
    def setAfterUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("afterUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    @scala.inline
    def setBeforeBuildTicks(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeBuildTicks", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBuildTicks: Self = this.set("beforeBuildTicks", js.undefined)
    @scala.inline
    def setBeforeCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeCalculateTickRotation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeCalculateTickRotation: Self = this.set("beforeCalculateTickRotation", js.undefined)
    @scala.inline
    def setBeforeDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeDataLimits", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDataLimits: Self = this.set("beforeDataLimits", js.undefined)
    @scala.inline
    def setBeforeFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeFit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeFit: Self = this.set("beforeFit", js.undefined)
    @scala.inline
    def setBeforeSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeSetDimension", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSetDimension: Self = this.set("beforeSetDimension", js.undefined)
    @scala.inline
    def setBeforeTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeTickToLabelConversion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeTickToLabelConversion: Self = this.set("beforeTickToLabelConversion", js.undefined)
    @scala.inline
    def setBeforeUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    @scala.inline
    def setBounds(value: String): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setDisplay(value: Boolean | String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = this.set("gridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLines: Self = this.set("gridLines", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOffset(value: Boolean): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScaleLabel(value: ScaleTitleOptions): Self = this.set("scaleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleLabel: Self = this.set("scaleLabel", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
    @scala.inline
    def setTicks(value: TickOptions): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setTime(value: TimeScale): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setType(value: ScaleType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

