package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartistStatic extends js.Object {
  var AutoScaleAxis: IAutoScaleAxisStatic = js.native
  var Bar: IChartistBarChart = js.native
  var Candle: IChartistCandleChart = js.native
  var FixedScaleAxis: IFixedScaleAxisStatic = js.native
  var Interpolation: ChartistInterpolationStatic = js.native
  var Line: IChartistLineChart = js.native
  var Pie: IChartistPieChart = js.native
  var StepAxis: IStepAxisStatic = js.native
  var Svg: ChartistSvgStatic = js.native
  /**
    * A map with characters to escape for strings to be safely used as attribute values.
    */
  var escapingMap: IChartistEscapeMap = js.native
  var noop: js.Function = js.native
   // TODO: Figure out if this is returning a ChartistSVGWrapper or an actual SVGElement
  var plugins: js.Any = js.native
  /**
    * Precision level used internally in Chartist for rounding. If you require more decimal places you can increase this number.
    */
  var precision: scala.Double = js.native
  def alphaNumerate(n: scala.Double): java.lang.String = js.native
  def createSvg(
    container: stdLib.Node,
    width: java.lang.String,
    height: java.lang.String,
    className: java.lang.String
  ): js.Object = js.native
  def deserialize(data: java.lang.String): js.Object | java.lang.String | scala.Double = js.native
  def ensureUnit(value: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def extend(target: js.Object, sources: js.Object*): js.Object = js.native
  def getMultiValue(value: js.Any): scala.Double = js.native
  def getMultiValue(value: js.Any, dimension: js.Any): scala.Double = js.native
  def mapAdd(addend: scala.Double): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def mapMultiply(factor: scala.Double): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def quantity(input: java.lang.String): js.Object = js.native
  def quantity(input: scala.Double): js.Object = js.native
  def query(query: java.lang.String): stdLib.Node = js.native
  def query(query: stdLib.Node): stdLib.Node = js.native
  def replaceAll(str: java.lang.String, subStr: java.lang.String, newSubStr: java.lang.String): java.lang.String = js.native
  def roundWithPrecision(value: scala.Double): scala.Double = js.native
  def roundWithPrecision(value: scala.Double, digits: scala.Double): scala.Double = js.native
  def serialMap(arr: js.Array[_], cb: js.Function): js.Array[_] = js.native
  def serialize(data: java.lang.String): java.lang.String = js.native
   // this method is not documented, but it is used in the examples
  def serialize(data: js.Object): java.lang.String = js.native
  def serialize(data: scala.Double): java.lang.String = js.native
  def sum(previous: scala.Double, current: scala.Double): scala.Double = js.native
  def times(length: scala.Double): js.Array[_] = js.native
}

