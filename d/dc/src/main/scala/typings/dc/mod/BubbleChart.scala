package typings.dc.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.dc.mod.ColorMixin because Already inherited
- typings.dc.mod.CoordinateGridMixin because var conflicts: colorAccessor_Original, colorCalculator_Original, colorDomain_Original, colors_Original. Inlined rangeChart, rangeChart, rangeChart_Original, zoomScale, zoomScale, zoomScale_Original, zoomOutRestrict, zoomOutRestrict, zoomOutRestrict_Original, g, g, g_Original, mouseZoomable, mouseZoomable, mouseZoomable_Original, chartBodyG, x, x, x_Original, xUnits, xUnits, xUnits_Original, xAxis, xAxis, xAxis_Original, elasticX, elasticX, elasticX_Original, xAxisPadding, xAxisPadding, xAxisPadding_Original, xUnitCount, useRightYAxis, useRightYAxis, useRightYAxis_Original, isOrdinal, xAxisLabel, xAxisLabel, xAxisLabel, xAxisLabel_Original, yAxisLabel, yAxisLabel, yAxisLabel, yAxisLabel_Original, y, y, y_Original, yAxis, yAxis, yAxis_Original, elasticY, elasticY, elasticY_Original, renderHorizontalGridLines, renderHorizontalGridLines, renderHorizontalGridLines_Original, renderVerticalGridLines, renderVerticalGridLines, renderVerticalGridLines_Original, xAxisMin, xAxisMax, yAxisMin, yAxisMax, yAxisPadding, yAxisPadding, yAxisPadding_Original, round, round, round_Original, clipPadding, clipPadding, clipPadding_Original, focus, focus, brushOn, brushOn, brushOn_Original */ @js.native
trait BubbleChart
  extends StObject
     with BubbleMixin[BubbleChart]
     with BaseMixin[BubbleChart]
     with MarginMixin[BubbleChart] {
  
  def brushOn(): Boolean = js.native
  def brushOn(t: Boolean): BubbleChart = js.native
  @JSName("brushOn")
  var brushOn_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def chartBodyG(): Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ] = js.native
  
  def clipPadding(): Double = js.native
  def clipPadding(t: Double): BubbleChart = js.native
  @JSName("clipPadding")
  var clipPadding_Original: IGetSet[Double, BubbleChart] = js.native
  
  def elasticRadius(): Boolean = js.native
  def elasticRadius(t: Boolean): BubbleChart = js.native
  @JSName("elasticRadius")
  var elasticRadius_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def elasticX(): Boolean = js.native
  def elasticX(t: Boolean): BubbleChart = js.native
  @JSName("elasticX")
  var elasticX_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def elasticY(): Boolean = js.native
  def elasticY(t: Boolean): BubbleChart = js.native
  @JSName("elasticY")
  var elasticY_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def focus(): Unit = js.native
  def focus(range: js.Array[js.Any]): Unit = js.native
  
  def g(): Selection_[
    js.Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
    BaseType, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
  ] = js.native
  def g(
    t: Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ]
  ): BubbleChart = js.native
  @JSName("g")
  var g_Original: IGetSet[
    Selection_[
      js.Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ], 
    BubbleChart
  ] = js.native
  
  def isOrdinal(): Boolean = js.native
  
  def mouseZoomable(): Boolean = js.native
  def mouseZoomable(t: Boolean): BubbleChart = js.native
  @JSName("mouseZoomable")
  var mouseZoomable_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def rangeChart(): BaseMixin[js.Any] = js.native
  def rangeChart(t: BaseMixin[js.Any]): BubbleChart = js.native
  @JSName("rangeChart")
  var rangeChart_Original: IGetSet[BaseMixin[js.Any], BubbleChart] = js.native
  
  def renderHorizontalGridLines(): Boolean = js.native
  def renderHorizontalGridLines(t: Boolean): BubbleChart = js.native
  @JSName("renderHorizontalGridLines")
  var renderHorizontalGridLines_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def renderVerticalGridLines(): Boolean = js.native
  def renderVerticalGridLines(t: Boolean): BubbleChart = js.native
  @JSName("renderVerticalGridLines")
  var renderVerticalGridLines_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def round(): js.Function1[/* value */ js.Any, js.Any] = js.native
  def round(t: js.Function1[/* value */ js.Any, js.Any]): BubbleChart = js.native
  @JSName("round")
  var round_Original: IGetSet[js.Function1[/* value */ js.Any, js.Any], BubbleChart] = js.native
  
  def useRightYAxis(): Boolean = js.native
  def useRightYAxis(t: Boolean): BubbleChart = js.native
  @JSName("useRightYAxis")
  var useRightYAxis_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def x(): js.Function1[/* n */ js.Any, js.Any] = js.native
  def x(t: js.Function1[/* n */ js.Any, js.Any]): BubbleChart = js.native
  
  def xAxis(): js.Any = js.native
  def xAxis(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
  ): BubbleChart = js.native
  
  def xAxisLabel(): String = js.native
  def xAxisLabel(t: String): BubbleChart = js.native
  def xAxisLabel(t: String, r: Double): BubbleChart = js.native
  @JSName("xAxisLabel")
  var xAxisLabel_Original: IBiGetSet[String, Double, BubbleChart] = js.native
  
  def xAxisMax(): js.Any = js.native
  
  def xAxisMin(): js.Any = js.native
  
  def xAxisPadding(): Double = js.native
  def xAxisPadding(t: Double): BubbleChart = js.native
  @JSName("xAxisPadding")
  var xAxisPadding_Original: IGetSet[Double, BubbleChart] = js.native
  
  @JSName("xAxis")
  var xAxis_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any, 
    BubbleChart
  ] = js.native
  
  def xUnitCount(): Double = js.native
  
  def xUnits(): UnitFunction = js.native
  def xUnits(t: UnitFunction): BubbleChart = js.native
  @JSName("xUnits")
  var xUnits_Original: IGetSet[UnitFunction, BubbleChart] = js.native
  
  @JSName("x")
  var x_Original: IGetSet[js.Function1[/* n */ js.Any, js.Any], BubbleChart] = js.native
  
  def y(): Scale[Double] = js.native
  def y(t: Scale[Double]): BubbleChart = js.native
  
  def yAxis(): js.Any = js.native
  def yAxis(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any
  ): BubbleChart = js.native
  
  def yAxisLabel(): String = js.native
  def yAxisLabel(t: String): BubbleChart = js.native
  def yAxisLabel(t: String, r: Double): BubbleChart = js.native
  @JSName("yAxisLabel")
  var yAxisLabel_Original: IBiGetSet[String, Double, BubbleChart] = js.native
  
  def yAxisMax(): js.Any = js.native
  
  def yAxisMin(): js.Any = js.native
  
  def yAxisPadding(): Double = js.native
  def yAxisPadding(t: Double): BubbleChart = js.native
  @JSName("yAxisPadding")
  var yAxisPadding_Original: IGetSet[Double, BubbleChart] = js.native
  
  @JSName("yAxis")
  var yAxis_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any, 
    BubbleChart
  ] = js.native
  
  @JSName("y")
  var y_Original: IGetSet[Scale[Double], BubbleChart] = js.native
  
  def zoomOutRestrict(): Boolean = js.native
  def zoomOutRestrict(t: Boolean): BubbleChart = js.native
  @JSName("zoomOutRestrict")
  var zoomOutRestrict_Original: IGetSet[Boolean, BubbleChart] = js.native
  
  def zoomScale(): js.Array[js.Any] = js.native
  def zoomScale(t: js.Array[js.Any]): BubbleChart = js.native
  @JSName("zoomScale")
  var zoomScale_Original: IGetSet[js.Array[js.Any], BubbleChart] = js.native
}
