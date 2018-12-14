package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILineChartOptions extends IChartOptions {
  var areaBase: js.UndefOr[scala.Double] = js.undefined
  var axisX: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  var axisY: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  var chartPadding: js.UndefOr[IChartPadding] = js.undefined
  var classNames: js.UndefOr[ILineChartClasses] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var high: js.UndefOr[scala.Double] = js.undefined
  var lineSmooth: js.UndefOr[js.Function | scala.Boolean] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var series: js.UndefOr[org.scalablytyped.runtime.StringDictionary[chartistLib.Anon_ShowPoint]] = js.undefined
  var showArea: js.UndefOr[scala.Boolean] = js.undefined
  var showLine: js.UndefOr[scala.Boolean] = js.undefined
  var showPoint: js.UndefOr[scala.Boolean] = js.undefined
  var ticks: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

