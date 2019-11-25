package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonAxe extends js.Object {
  var afterBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  var bounds: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[Boolean | String] = js.undefined
  var gridLines: js.UndefOr[GridLineOptions] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.undefined
  var stacked: js.UndefOr[Boolean] = js.undefined
  var ticks: js.UndefOr[TickOptions] = js.undefined
  var time: js.UndefOr[TimeScale] = js.undefined
  var `type`: js.UndefOr[ScaleType | String] = js.undefined
}

object CommonAxe {
  @scala.inline
  def apply(
    afterBuildTicks: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterCalculateTickRotation: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterDataLimits: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterFit: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterSetDimension: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterTickToLabelConversion: /* scale */ js.UndefOr[js.Any] => Unit = null,
    afterUpdate: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeBuildTicks: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeCalculateTickRotation: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeDataLimits: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeFit: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeSetDimension: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeTickToLabelConversion: /* scale */ js.UndefOr[js.Any] => Unit = null,
    beforeUpdate: /* scale */ js.UndefOr[js.Any] => Unit = null,
    bounds: String = null,
    display: Boolean | String = null,
    gridLines: GridLineOptions = null,
    id: String = null,
    offset: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    scaleLabel: ScaleTitleOptions = null,
    stacked: js.UndefOr[Boolean] = js.undefined,
    ticks: TickOptions = null,
    time: TimeScale = null,
    `type`: ScaleType | String = null
  ): CommonAxe = {
    val __obj = js.Dynamic.literal()
    if (afterBuildTicks != null) __obj.updateDynamic("afterBuildTicks")(js.Any.fromFunction1(afterBuildTicks))
    if (afterCalculateTickRotation != null) __obj.updateDynamic("afterCalculateTickRotation")(js.Any.fromFunction1(afterCalculateTickRotation))
    if (afterDataLimits != null) __obj.updateDynamic("afterDataLimits")(js.Any.fromFunction1(afterDataLimits))
    if (afterFit != null) __obj.updateDynamic("afterFit")(js.Any.fromFunction1(afterFit))
    if (afterSetDimension != null) __obj.updateDynamic("afterSetDimension")(js.Any.fromFunction1(afterSetDimension))
    if (afterTickToLabelConversion != null) __obj.updateDynamic("afterTickToLabelConversion")(js.Any.fromFunction1(afterTickToLabelConversion))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction1(afterUpdate))
    if (beforeBuildTicks != null) __obj.updateDynamic("beforeBuildTicks")(js.Any.fromFunction1(beforeBuildTicks))
    if (beforeCalculateTickRotation != null) __obj.updateDynamic("beforeCalculateTickRotation")(js.Any.fromFunction1(beforeCalculateTickRotation))
    if (beforeDataLimits != null) __obj.updateDynamic("beforeDataLimits")(js.Any.fromFunction1(beforeDataLimits))
    if (beforeFit != null) __obj.updateDynamic("beforeFit")(js.Any.fromFunction1(beforeFit))
    if (beforeSetDimension != null) __obj.updateDynamic("beforeSetDimension")(js.Any.fromFunction1(beforeSetDimension))
    if (beforeTickToLabelConversion != null) __obj.updateDynamic("beforeTickToLabelConversion")(js.Any.fromFunction1(beforeTickToLabelConversion))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction1(beforeUpdate))
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAxe]
  }
}

