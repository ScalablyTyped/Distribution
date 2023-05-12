package typings.dc.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Shape.mod.Symbol_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterPlot
  extends StObject
     with CoordinateGridMixin[ScatterPlot] {
  
  def canvas(): Selection_[BaseType, Any, BaseType, Any] = js.native
  def canvas(t: Selection_[BaseType, Any, BaseType, Any]): ScatterPlot = js.native
  @JSName("canvas")
  var canvas_Original: IGetSet[Selection_[BaseType, Any, BaseType, Any], ScatterPlot] = js.native
  
  def customSymbol(): String | js.Function = js.native
  def customSymbol(t: String): ScatterPlot = js.native
  def customSymbol(t: js.Function): ScatterPlot = js.native
  @JSName("customSymbol")
  var customSymbol_Original: IGetSet[String | js.Function, ScatterPlot] = js.native
  
  def emptyColor(): String = js.native
  def emptyColor(t: String): ScatterPlot = js.native
  @JSName("emptyColor")
  var emptyColor_Original: IGetSet[String, ScatterPlot] = js.native
  
  def emptyOpacity(): Double = js.native
  def emptyOpacity(t: Double): ScatterPlot = js.native
  @JSName("emptyOpacity")
  var emptyOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def excludedColor(): Double = js.native
  def excludedColor(t: Double): ScatterPlot = js.native
  @JSName("excludedColor")
  var excludedColor_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def excludedOpacity(): Double = js.native
  def excludedOpacity(t: Double): ScatterPlot = js.native
  @JSName("excludedOpacity")
  var excludedOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def excludedSize(): Double = js.native
  def excludedSize(t: Double): ScatterPlot = js.native
  @JSName("excludedSize")
  var excludedSize_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def existenceAccessor(): Accessor[Any, Boolean] = js.native
  def existenceAccessor(t: Accessor[Any, Boolean]): ScatterPlot = js.native
  @JSName("existenceAccessor")
  var existenceAccessor_Original: IGetSet[Accessor[Any, Boolean], ScatterPlot] = js.native
  
  def hiddenSize(): Double = js.native
  def hiddenSize(t: Double): ScatterPlot = js.native
  @JSName("hiddenSize")
  var hiddenSize_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def highlightedSize(): Double = js.native
  def highlightedSize(t: Double): ScatterPlot = js.native
  @JSName("highlightedSize")
  var highlightedSize_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def nonemptyOpacity(): Double = js.native
  def nonemptyOpacity(t: Double): ScatterPlot = js.native
  @JSName("nonemptyOpacity")
  var nonemptyOpacity_Original: IGetSet[Double, ScatterPlot] = js.native
  
  def resizeCanvas(): Unit = js.native
  
  def symbol(): Symbol_[Any, Any] = js.native
  def symbol(t: Symbol_[Any, Any]): ScatterPlot = js.native
  
  def symbolSize(): Double = js.native
  def symbolSize(t: Double): ScatterPlot = js.native
  @JSName("symbolSize")
  var symbolSize_Original: IGetSet[Double, ScatterPlot] = js.native
  
  @JSName("symbol")
  var symbol_Original: IGetSet[Symbol_[Any, Any], ScatterPlot] = js.native
  
  def useCanvas(): Boolean = js.native
  def useCanvas(t: Boolean): ScatterPlot = js.native
  @JSName("useCanvas")
  var useCanvas_Original: IGetSet[Boolean, ScatterPlot] = js.native
}
