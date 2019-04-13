package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinateGridMixin[T]
  extends BaseMixin[T]
     with MarginMixin[T]
     with ColorMixin[T] {
  @JSName("brushOn")
  var brushOn_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("clipPadding")
  var clipPadding_Original: IGetSet[scala.Double, T] = js.native
  @JSName("elasticX")
  var elasticX_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("elasticY")
  var elasticY_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("g")
  var g_Original: IGetSet[
    d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ], 
    T
  ] = js.native
  @JSName("mouseZoomable")
  var mouseZoomable_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("rangeChart")
  var rangeChart_Original: IGetSet[BaseMixin[_], T] = js.native
  @JSName("renderHorizontalGridLines")
  var renderHorizontalGridLines_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("renderVerticalGridLines")
  var renderVerticalGridLines_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("round")
  var round_Original: IGetSet[js.Function1[/* value */ _, _], T] = js.native
  @JSName("useRightYAxis")
  var useRightYAxis_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("xAxisLabel")
  var xAxisLabel_Original: IBiGetSet[java.lang.String, scala.Double, T] = js.native
  @JSName("xAxisPadding")
  var xAxisPadding_Original: IGetSet[scala.Double, T] = js.native
  @JSName("xAxis")
  var xAxis_Original: IGetSet[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ _, 
    T
  ] = js.native
  @JSName("xUnits")
  var xUnits_Original: IGetSet[UnitFunction, T] = js.native
  @JSName("x")
  var x_Original: IGetSet[js.Function1[/* n */ _, _], T] = js.native
  @JSName("yAxisLabel")
  var yAxisLabel_Original: IBiGetSet[java.lang.String, scala.Double, T] = js.native
  @JSName("yAxisPadding")
  var yAxisPadding_Original: IGetSet[scala.Double, T] = js.native
  @JSName("yAxis")
  var yAxis_Original: IGetSet[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ _, 
    T
  ] = js.native
  @JSName("y")
  var y_Original: IGetSet[Scale[scala.Double], T] = js.native
  @JSName("zoomOutRestrict")
  var zoomOutRestrict_Original: IGetSet[scala.Boolean, T] = js.native
  @JSName("zoomScale")
  var zoomScale_Original: IGetSet[js.Array[_], T] = js.native
  def brushOn(): scala.Boolean = js.native
  def brushOn(t: scala.Boolean): scala.Boolean = js.native
  def chartBodyG(): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def clipPadding(): scala.Double = js.native
  def clipPadding(t: scala.Double): scala.Double = js.native
  def elasticX(): scala.Boolean = js.native
  def elasticX(t: scala.Boolean): scala.Boolean = js.native
  def elasticY(): scala.Boolean = js.native
  def elasticY(t: scala.Boolean): scala.Boolean = js.native
  def focus(): scala.Unit = js.native
  def focus(range: js.Array[_]): scala.Unit = js.native
  def g(): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def g(
    t: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ]
  ): d3DashSelectionLib.d3DashSelectionMod.Selection[
    _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
    d3DashSelectionLib.d3DashSelectionMod.BaseType, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
  ] = js.native
  def isOrdinal(): scala.Boolean = js.native
  def mouseZoomable(): scala.Boolean = js.native
  def mouseZoomable(t: scala.Boolean): scala.Boolean = js.native
  def rangeChart(): BaseMixin[_] = js.native
  def rangeChart(t: BaseMixin[_]): BaseMixin[_] = js.native
  def renderHorizontalGridLines(): scala.Boolean = js.native
  def renderHorizontalGridLines(t: scala.Boolean): scala.Boolean = js.native
  def renderVerticalGridLines(): scala.Boolean = js.native
  def renderVerticalGridLines(t: scala.Boolean): scala.Boolean = js.native
  def round(): js.Function1[/* value */ js.Any, _] = js.native
  def round(t: js.Function1[/* value */ js.Any, _]): js.Function1[/* value */ js.Any, _] = js.native
  def useRightYAxis(): scala.Boolean = js.native
  def useRightYAxis(t: scala.Boolean): scala.Boolean = js.native
  def x(): js.Function1[/* n */ js.Any, _] = js.native
  def x(t: js.Function1[/* n */ js.Any, _]): js.Function1[/* n */ js.Any, _] = js.native
  def xAxis(): js.Any = js.native
  def xAxis(t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any): js.Any = js.native
  def xAxisLabel(): java.lang.String = js.native
  def xAxisLabel(t: java.lang.String): java.lang.String = js.native
  def xAxisLabel(t: java.lang.String, r: scala.Double): java.lang.String = js.native
  def xAxisMax(): js.Any = js.native
  def xAxisMin(): js.Any = js.native
  def xAxisPadding(): scala.Double = js.native
  def xAxisPadding(t: scala.Double): scala.Double = js.native
  def xUnitCount(): scala.Double = js.native
  def xUnits(): UnitFunction = js.native
  def xUnits(t: UnitFunction): UnitFunction = js.native
  def y(): Scale[scala.Double] = js.native
  def y(t: Scale[scala.Double]): Scale[scala.Double] = js.native
  def yAxis(): js.Any = js.native
  def yAxis(t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any): js.Any = js.native
  def yAxisLabel(): java.lang.String = js.native
  def yAxisLabel(t: java.lang.String): java.lang.String = js.native
  def yAxisLabel(t: java.lang.String, r: scala.Double): java.lang.String = js.native
  def yAxisMax(): js.Any = js.native
  def yAxisMin(): js.Any = js.native
  def yAxisPadding(): scala.Double = js.native
  def yAxisPadding(t: scala.Double): scala.Double = js.native
  def zoomOutRestrict(): scala.Boolean = js.native
  def zoomOutRestrict(t: scala.Boolean): scala.Boolean = js.native
  def zoomScale(): js.Array[_] = js.native
  def zoomScale(t: js.Array[_]): js.Array[_] = js.native
}

