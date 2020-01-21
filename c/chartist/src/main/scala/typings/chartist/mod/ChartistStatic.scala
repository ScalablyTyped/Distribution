package typings.chartist.mod

import typings.std.Node
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
  var precision: Double = js.native
  def alphaNumerate(n: Double): String = js.native
  def createSvg(container: Node, width: String, height: String, className: String): js.Object = js.native
  def deserialize(data: String): js.Object | String | Double = js.native
  def ensureUnit(value: Double, unit: String): String = js.native
  def extend(target: js.Object, sources: js.Object*): js.Object = js.native
  def getMultiValue(value: js.Any): Double = js.native
  def getMultiValue(value: js.Any, dimension: js.Any): Double = js.native
  def mapAdd(addend: Double): js.Function1[/* num */ Double, Double] = js.native
  def mapMultiply(factor: Double): js.Function1[/* num */ Double, Double] = js.native
  def quantity(input: String): js.Object = js.native
  def quantity(input: Double): js.Object = js.native
  def query(query: String): Node = js.native
  def query(query: Node): Node = js.native
  def replaceAll(str: String, subStr: String, newSubStr: String): String = js.native
  def roundWithPrecision(value: Double): Double = js.native
  def roundWithPrecision(value: Double, digits: Double): Double = js.native
  def serialMap(arr: js.Array[_], cb: js.Function): js.Array[_] = js.native
  def serialize(data: String): String = js.native
   // this method is not documented, but it is used in the examples
  def serialize(data: js.Object): String = js.native
  def serialize(data: Double): String = js.native
  def sum(previous: Double, current: Double): Double = js.native
  def times(length: Double): js.Array[_] = js.native
}

