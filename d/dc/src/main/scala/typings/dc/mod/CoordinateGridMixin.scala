package typings.dc.mod

import typings.d3Axis.mod.Axis
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateGridMixin[T]
  extends StObject
     with BaseMixin[T]
     with MarginMixin[T]
     with ColorMixin[T] {
  
  def brushOn(): Boolean = js.native
  def brushOn(t: Boolean): T = js.native
  @JSName("brushOn")
  var brushOn_Original: IGetSet[Boolean, T] = js.native
  
  def chartBodyG(): Selection_[BaseType, Any, BaseType, Any] = js.native
  
  def clipPadding(): Double = js.native
  def clipPadding(t: Double): T = js.native
  @JSName("clipPadding")
  var clipPadding_Original: IGetSet[Double, T] = js.native
  
  def elasticX(): Boolean = js.native
  def elasticX(t: Boolean): T = js.native
  @JSName("elasticX")
  var elasticX_Original: IGetSet[Boolean, T] = js.native
  
  def elasticY(): Boolean = js.native
  def elasticY(t: Boolean): T = js.native
  @JSName("elasticY")
  var elasticY_Original: IGetSet[Boolean, T] = js.native
  
  def focus(): Unit = js.native
  def focus(range: js.Array[Any]): Unit = js.native
  
  def g(): Selection_[BaseType, Any, BaseType, Any] = js.native
  def g(t: Selection_[BaseType, Any, BaseType, Any]): T = js.native
  @JSName("g")
  var g_Original: IGetSet[Selection_[BaseType, Any, BaseType, Any], T] = js.native
  
  def isOrdinal(): Boolean = js.native
  
  def mouseZoomable(): Boolean = js.native
  def mouseZoomable(t: Boolean): T = js.native
  @JSName("mouseZoomable")
  var mouseZoomable_Original: IGetSet[Boolean, T] = js.native
  
  def rangeChart(): BaseMixin[Any] = js.native
  def rangeChart(t: BaseMixin[Any]): T = js.native
  @JSName("rangeChart")
  var rangeChart_Original: IGetSet[BaseMixin[Any], T] = js.native
  
  def renderHorizontalGridLines(): Boolean = js.native
  def renderHorizontalGridLines(t: Boolean): T = js.native
  @JSName("renderHorizontalGridLines")
  var renderHorizontalGridLines_Original: IGetSet[Boolean, T] = js.native
  
  def renderVerticalGridLines(): Boolean = js.native
  def renderVerticalGridLines(t: Boolean): T = js.native
  @JSName("renderVerticalGridLines")
  var renderVerticalGridLines_Original: IGetSet[Boolean, T] = js.native
  
  def round(): js.Function1[/* value */ Any, Any] = js.native
  def round(t: js.Function1[/* value */ Any, Any]): T = js.native
  @JSName("round")
  var round_Original: IGetSet[js.Function1[/* value */ Any, Any], T] = js.native
  
  def useRightYAxis(): Boolean = js.native
  def useRightYAxis(t: Boolean): T = js.native
  @JSName("useRightYAxis")
  var useRightYAxis_Original: IGetSet[Boolean, T] = js.native
  
  def x(): js.Function1[/* n */ Any, Any] = js.native
  def x(t: js.Function1[/* n */ Any, Any]): T = js.native
  
  def xAxis(): Axis[Any] = js.native
  def xAxis(t: Axis[Any]): T = js.native
  
  def xAxisLabel(): String = js.native
  def xAxisLabel(t: String): T = js.native
  def xAxisLabel(t: String, r: Double): T = js.native
  @JSName("xAxisLabel")
  var xAxisLabel_Original: IBiGetSet[String, Double, T] = js.native
  
  def xAxisMax(): Any = js.native
  
  def xAxisMin(): Any = js.native
  
  def xAxisPadding(): Double = js.native
  def xAxisPadding(t: Double): T = js.native
  @JSName("xAxisPadding")
  var xAxisPadding_Original: IGetSet[Double, T] = js.native
  
  @JSName("xAxis")
  var xAxis_Original: IGetSet[Axis[Any], T] = js.native
  
  def xUnitCount(): Double = js.native
  
  def xUnits(): UnitFunction = js.native
  def xUnits(t: UnitFunction): T = js.native
  @JSName("xUnits")
  var xUnits_Original: IGetSet[UnitFunction, T] = js.native
  
  @JSName("x")
  var x_Original: IGetSet[js.Function1[/* n */ Any, Any], T] = js.native
  
  def y(): Scale[Double] = js.native
  def y(t: Scale[Double]): T = js.native
  
  def yAxis(): Axis[Any] = js.native
  def yAxis(t: Axis[Any]): T = js.native
  
  def yAxisLabel(): String = js.native
  def yAxisLabel(t: String): T = js.native
  def yAxisLabel(t: String, r: Double): T = js.native
  @JSName("yAxisLabel")
  var yAxisLabel_Original: IBiGetSet[String, Double, T] = js.native
  
  def yAxisMax(): Any = js.native
  
  def yAxisMin(): Any = js.native
  
  def yAxisPadding(): Double = js.native
  def yAxisPadding(t: Double): T = js.native
  @JSName("yAxisPadding")
  var yAxisPadding_Original: IGetSet[Double, T] = js.native
  
  @JSName("yAxis")
  var yAxis_Original: IGetSet[Axis[Any], T] = js.native
  
  @JSName("y")
  var y_Original: IGetSet[Scale[Double], T] = js.native
  
  def zoomOutRestrict(): Boolean = js.native
  def zoomOutRestrict(t: Boolean): T = js.native
  @JSName("zoomOutRestrict")
  var zoomOutRestrict_Original: IGetSet[Boolean, T] = js.native
  
  def zoomScale(): js.Array[Any] = js.native
  def zoomScale(t: js.Array[Any]): T = js.native
  @JSName("zoomScale")
  var zoomScale_Original: IGetSet[js.Array[Any], T] = js.native
}
