package typings.dc.dcMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlot extends CoordinateGridMixin[ScatterPlot] {
  @JSName("canvas")
  var canvas_Original: IGetSet[
    Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ], 
    ScatterPlot
  ] = js.native
  @JSName("customSymbol")
  var customSymbol_Original: IGetSet[String | js.Function, ScatterPlot] = js.native
  @JSName("emptyColor")
  var emptyColor_Original: IGetSet[String, ScatterPlot] = js.native
  @JSName("emptyOpacity")
  var emptyOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("excludedColor")
  var excludedColor_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("excludedOpacity")
  var excludedOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("excludedSize")
  var excludedSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("existenceAccessor")
  var existenceAccessor_Original: IGetSet[Accessor[_, Boolean], ScatterPlot] = js.native
  @JSName("hiddenSize")
  var hiddenSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("highlightedSize")
  var highlightedSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("nonemptyOpacity")
  var nonemptyOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("symbolSize")
  var symbolSize_Original: IGetSet[Double, ScatterPlot] = js.native
  @JSName("symbol")
  var symbol_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Symbol<any> */ _, 
    ScatterPlot
  ] = js.native
  @JSName("useCanvas")
  var useCanvas_Original: IGetSet[Boolean, ScatterPlot] = js.native
  def canvas(): Selection[
    _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
  ] = js.native
  def canvas(
    t: Selection[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ]
  ): ScatterPlot = js.native
  def customSymbol(): String | js.Function = js.native
  def customSymbol(t: String): ScatterPlot = js.native
  def customSymbol(t: js.Function): ScatterPlot = js.native
  def emptyColor(): String = js.native
  def emptyColor(t: String): ScatterPlot = js.native
  def emptyOpacity(): Double = js.native
  def emptyOpacity(t: Double): ScatterPlot = js.native
  def excludedColor(): Double = js.native
  def excludedColor(t: Double): ScatterPlot = js.native
  def excludedOpacity(): Double = js.native
  def excludedOpacity(t: Double): ScatterPlot = js.native
  def excludedSize(): Double = js.native
  def excludedSize(t: Double): ScatterPlot = js.native
  def existenceAccessor(): Accessor[_, Boolean] = js.native
  def existenceAccessor(t: Accessor[_, Boolean]): ScatterPlot = js.native
  def hiddenSize(): Double = js.native
  def hiddenSize(t: Double): ScatterPlot = js.native
  def highlightedSize(): Double = js.native
  def highlightedSize(t: Double): ScatterPlot = js.native
  def nonemptyOpacity(): Double = js.native
  def nonemptyOpacity(t: Double): ScatterPlot = js.native
  def resizeCanvas(): Unit = js.native
  def symbol(): js.Any = js.native
  def symbol(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Symbol<any> */ js.Any
  ): ScatterPlot = js.native
  def symbolSize(): Double = js.native
  def symbolSize(t: Double): ScatterPlot = js.native
  def useCanvas(): Boolean = js.native
  def useCanvas(t: Boolean): ScatterPlot = js.native
}

