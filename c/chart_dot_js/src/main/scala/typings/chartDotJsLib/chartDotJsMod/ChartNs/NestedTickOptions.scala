package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedTickOptions extends js.Object {
  var autoSkip: js.UndefOr[scala.Boolean] = js.undefined
  var autoSkipPadding: js.UndefOr[scala.Double] = js.undefined
  var backdropColor: js.UndefOr[ChartColor] = js.undefined
  var backdropPaddingX: js.UndefOr[scala.Double] = js.undefined
  var backdropPaddingY: js.UndefOr[scala.Double] = js.undefined
  var beginAtZero: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* values */ js.Any, 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var labelOffset: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxRotation: js.UndefOr[scala.Double] = js.undefined
  var maxTicksLimit: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minRotation: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var showLabelBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.auto | chartDotJsLib.chartDotJsLibStrings.data | chartDotJsLib.chartDotJsLibStrings.labels
  ] = js.undefined
  var stepSize: js.UndefOr[scala.Double] = js.undefined
  var suggestedMax: js.UndefOr[scala.Double] = js.undefined
  var suggestedMin: js.UndefOr[scala.Double] = js.undefined
}

