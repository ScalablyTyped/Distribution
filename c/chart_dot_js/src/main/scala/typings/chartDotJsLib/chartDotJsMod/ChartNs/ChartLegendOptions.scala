package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendOptions extends js.Object {
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var labels: js.UndefOr[ChartLegendLabelOptions] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* event */ stdLib.MouseEvent, /* legendItem */ ChartLegendLabelItem, scala.Unit]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.Function2[/* event */ stdLib.MouseEvent, /* legendItem */ ChartLegendLabelItem, scala.Unit]
  ] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartLegendOptions {
  @scala.inline
  def apply(
    display: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    labels: ChartLegendLabelOptions = null,
    onClick: js.Function2[/* event */ stdLib.MouseEvent, /* legendItem */ ChartLegendLabelItem, scala.Unit] = null,
    onHover: js.Function2[/* event */ stdLib.MouseEvent, /* legendItem */ ChartLegendLabelItem, scala.Unit] = null,
    position: PositionType = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    __obj.asInstanceOf[ChartLegendOptions]
  }
}

