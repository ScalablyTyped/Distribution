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

