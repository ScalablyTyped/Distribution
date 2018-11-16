package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlot extends CoordinateGridMixin[ScatterPlot] {
  @JSName("existenceAccessor")
  var existenceAccessor_Original: IGetSet[Accessor[_, scala.Boolean], ScatterPlot] = js.native
  @JSName("hiddenSize")
  var hiddenSize_Original: IGetSet[scala.Double, ScatterPlot] = js.native
  @JSName("highlightedSize")
  var highlightedSize_Original: IGetSet[scala.Double, ScatterPlot] = js.native
  @JSName("symbolSize")
  var symbolSize_Original: IGetSet[scala.Double, ScatterPlot] = js.native
  @JSName("symbol")
  var symbol_Original: IGetSet[_, ScatterPlot] = js.native
  def existenceAccessor(): Accessor[_, scala.Boolean] = js.native
  def existenceAccessor(t: Accessor[_, scala.Boolean]): ScatterPlot = js.native
  def hiddenSize(): scala.Double = js.native
  def hiddenSize(t: scala.Double): ScatterPlot = js.native
  def highlightedSize(): scala.Double = js.native
  def highlightedSize(t: scala.Double): ScatterPlot = js.native
  def symbol(): js.Any = js.native
  def symbol(t: js.Any): ScatterPlot = js.native
  def symbolSize(): scala.Double = js.native
  def symbolSize(t: scala.Double): ScatterPlot = js.native
}

