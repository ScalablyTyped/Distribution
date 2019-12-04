package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlot extends CoordinateGridMixin[ScatterPlot] {
  @JSName("existenceAccessor")
  var existenceAccessor_Original: IGetSet[Accessor[_, Boolean], ScatterPlot] = js.native
  @JSName("hiddenSize")
  var hiddenSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("highlightedSize")
  var highlightedSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("symbolSize")
  var symbolSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("symbol")
  var symbol_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Symbol<any> */ _, 
    ScatterPlot
  ] = js.native
  def existenceAccessor(): Accessor[_, Boolean] = js.native
  def existenceAccessor(t: Accessor[_, Boolean]): ScatterPlot = js.native
  def hiddenSize(): Double = js.native
  def hiddenSize(t: Double): ScatterPlot = js.native
  def highlightedSize(): Double = js.native
  def highlightedSize(t: Double): ScatterPlot = js.native
  def symbol(): js.Any = js.native
  def symbol(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Symbol<any> */ js.Any
  ): ScatterPlot = js.native
  def symbolSize(): Double = js.native
  def symbolSize(t: Double): ScatterPlot = js.native
}

