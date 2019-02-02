package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-shape", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val curveBasis: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveBasisClosed: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveBasisOpen: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveBundle: d3DashShapeLib.d3DashShapeMod.CurveBundleFactory = js.native
  val curveCardinal: d3DashShapeLib.d3DashShapeMod.CurveCardinalFactory = js.native
  val curveCardinalClosed: d3DashShapeLib.d3DashShapeMod.CurveCardinalFactory = js.native
  val curveCardinalOpen: d3DashShapeLib.d3DashShapeMod.CurveCardinalFactory = js.native
  val curveCatmullRom: d3DashShapeLib.d3DashShapeMod.CurveCatmullRomFactory = js.native
  val curveCatmullRomClosed: d3DashShapeLib.d3DashShapeMod.CurveCatmullRomFactory = js.native
  val curveCatmullRomOpen: d3DashShapeLib.d3DashShapeMod.CurveCatmullRomFactory = js.native
  val curveLinear: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveLinearClosed: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveMonotoneX: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveMonotoneY: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveNatural: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveStep: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveStepAfter: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val curveStepBefore: d3DashShapeLib.d3DashShapeMod.CurveFactory = js.native
  val symbolCircle: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolCross: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolDiamond: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolSquare: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolStar: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolTriangle: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbolWye: d3DashShapeLib.d3DashShapeMod.SymbolType = js.native
  val symbols: js.Array[d3DashShapeLib.d3DashShapeMod.SymbolType] = js.native
  def arc(): d3DashShapeLib.d3DashShapeMod.Arc[_, d3DashShapeLib.d3DashShapeMod.DefaultArcObject] = js.native
  @JSName("arc")
  def arc_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Arc[_, Datum] = js.native
  @JSName("arc")
  def arc_ThisDatum[This, Datum](): d3DashShapeLib.d3DashShapeMod.Arc[This, Datum] = js.native
  def area(): d3DashShapeLib.d3DashShapeMod.Area[js.Tuple2[scala.Double, scala.Double]] = js.native
  def areaRadial(): d3DashShapeLib.d3DashShapeMod.AreaRadial[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("areaRadial")
  def areaRadial_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.AreaRadial[Datum] = js.native
  @JSName("area")
  def area_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Area[Datum] = js.native
  def line(): d3DashShapeLib.d3DashShapeMod.Line[js.Tuple2[scala.Double, scala.Double]] = js.native
  def lineRadial(): d3DashShapeLib.d3DashShapeMod.LineRadial[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("lineRadial")
  def lineRadial_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.LineRadial[Datum] = js.native
  @JSName("line")
  def line_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Line[Datum] = js.native
  def linkHorizontal(): d3DashShapeLib.d3DashShapeMod.Link[
    _, 
    d3DashShapeLib.d3DashShapeMod.DefaultLinkObject, 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  @JSName("linkHorizontal")
  def linkHorizontal_LinkDatumNodeDatum[LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.Link[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkHorizontal")
  def linkHorizontal_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.Link[This, LinkDatum, NodeDatum] = js.native
  def linkRadial(): d3DashShapeLib.d3DashShapeMod.LinkRadial[
    _, 
    d3DashShapeLib.d3DashShapeMod.DefaultLinkObject, 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  @JSName("linkRadial")
  def linkRadial_LinkDatumNodeDatum[LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.LinkRadial[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkRadial")
  def linkRadial_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.LinkRadial[This, LinkDatum, NodeDatum] = js.native
  def linkVertical(): d3DashShapeLib.d3DashShapeMod.Link[
    _, 
    d3DashShapeLib.d3DashShapeMod.DefaultLinkObject, 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  @JSName("linkVertical")
  def linkVertical_LinkDatumNodeDatum[LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.Link[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkVertical")
  def linkVertical_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): d3DashShapeLib.d3DashShapeMod.Link[This, LinkDatum, NodeDatum] = js.native
  def pie(): d3DashShapeLib.d3DashShapeMod.Pie[_, scala.Double | d3DashShapeLib.Anon_ValueOf] = js.native
  @JSName("pie")
  def pie_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Pie[_, Datum] = js.native
  @JSName("pie")
  def pie_ThisDatum[This, Datum](): d3DashShapeLib.d3DashShapeMod.Pie[This, Datum] = js.native
  def pointRadial(angle: scala.Double, radius: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def radialArea(): d3DashShapeLib.d3DashShapeMod.RadialArea[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("radialArea")
  def radialArea_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.RadialArea[Datum] = js.native
  def radialLine(): d3DashShapeLib.d3DashShapeMod.RadialLine[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("radialLine")
  def radialLine_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.RadialLine[Datum] = js.native
  def stack(): d3DashShapeLib.d3DashShapeMod.Stack[_, org.scalablytyped.runtime.StringDictionary[scala.Double], java.lang.String] = js.native
  def stackOffsetDiverging(series: d3DashShapeLib.d3DashShapeMod.Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetExpand(series: d3DashShapeLib.d3DashShapeMod.Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetNone(series: d3DashShapeLib.d3DashShapeMod.Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetSilhouette(series: d3DashShapeLib.d3DashShapeMod.Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetWiggle(series: d3DashShapeLib.d3DashShapeMod.Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOrderAppearance(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderAscending(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderDescending(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderInsideOut(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderNone(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderReverse(series: d3DashShapeLib.d3DashShapeMod.Series[_, _]): js.Array[scala.Double] = js.native
  @JSName("stack")
  def stack_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Stack[_, Datum, java.lang.String] = js.native
  @JSName("stack")
  def stack_DatumKey[Datum, Key](): d3DashShapeLib.d3DashShapeMod.Stack[_, Datum, Key] = js.native
  @JSName("stack")
  def stack_ThisDatumKey[This, Datum, Key](): d3DashShapeLib.d3DashShapeMod.Stack[This, Datum, Key] = js.native
  def symbol(): d3DashShapeLib.d3DashShapeMod.Symbol[_, _] = js.native
  @JSName("symbol")
  def symbol_Datum[Datum](): d3DashShapeLib.d3DashShapeMod.Symbol[_, Datum] = js.native
  @JSName("symbol")
  def symbol_ThisDatum[This, Datum](): d3DashShapeLib.d3DashShapeMod.Symbol[This, Datum] = js.native
}

