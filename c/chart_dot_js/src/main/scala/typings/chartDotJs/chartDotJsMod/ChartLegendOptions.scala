package typings.chartDotJs.chartDotJsMod

import typings.chartDotJs.chartDotJsStrings.center
import typings.chartDotJs.chartDotJsStrings.end
import typings.chartDotJs.chartDotJsStrings.start
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendOptions extends js.Object {
  var align: js.UndefOr[center | end | start] = js.undefined
  var display: js.UndefOr[Boolean] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var labels: js.UndefOr[ChartLegendLabelOptions] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.Function2[/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem, Unit]
  ] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object ChartLegendOptions {
  @scala.inline
  def apply(
    align: center | end | start = null,
    display: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    labels: ChartLegendLabelOptions = null,
    onClick: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit = null,
    onHover: (/* event */ MouseEvent, /* legendItem */ ChartLegendLabelItem) => Unit = null,
    position: PositionType = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendOptions]
  }
}

