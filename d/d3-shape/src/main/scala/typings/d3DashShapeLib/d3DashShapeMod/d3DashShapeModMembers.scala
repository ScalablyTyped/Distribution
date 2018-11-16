package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-shape", JSImport.Namespace)
@js.native
object d3DashShapeModMembers extends js.Object {
  val curveBasis: CurveFactory = js.native
  val curveBasisClosed: CurveFactory = js.native
  val curveBasisOpen: CurveFactory = js.native
  val curveBundle: CurveBundleFactory = js.native
  val curveCardinal: CurveCardinalFactory = js.native
  val curveCardinalClosed: CurveCardinalFactory = js.native
  val curveCardinalOpen: CurveCardinalFactory = js.native
  val curveCatmullRom: CurveCatmullRomFactory = js.native
  val curveCatmullRomClosed: CurveCatmullRomFactory = js.native
  val curveCatmullRomOpen: CurveCatmullRomFactory = js.native
  val curveLinear: CurveFactory = js.native
  val curveLinearClosed: CurveFactory = js.native
  val curveMonotoneX: CurveFactory = js.native
  val curveMonotoneY: CurveFactory = js.native
  val curveNatural: CurveFactory = js.native
  val curveStep: CurveFactory = js.native
  val curveStepAfter: CurveFactory = js.native
  val curveStepBefore: CurveFactory = js.native
  val symbolCircle: SymbolType = js.native
  val symbolCross: SymbolType = js.native
  val symbolDiamond: SymbolType = js.native
  val symbolSquare: SymbolType = js.native
  val symbolStar: SymbolType = js.native
  val symbolTriangle: SymbolType = js.native
  val symbolWye: SymbolType = js.native
  val symbols: js.Array[SymbolType] = js.native
  def arc(): Arc[_, DefaultArcObject] = js.native
  @JSName("arc")
  def arc_Datum[Datum](): Arc[_, Datum] = js.native
  @JSName("arc")
  def arc_ThisDatum[This, Datum](): Arc[This, Datum] = js.native
  def area(): Area[js.Tuple2[scala.Double, scala.Double]] = js.native
  def areaRadial(): AreaRadial[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("areaRadial")
  def areaRadial_Datum[Datum](): AreaRadial[Datum] = js.native
  @JSName("area")
  def area_Datum[Datum](): Area[Datum] = js.native
  def line(): Line[js.Tuple2[scala.Double, scala.Double]] = js.native
  def lineRadial(): LineRadial[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("lineRadial")
  def lineRadial_Datum[Datum](): LineRadial[Datum] = js.native
  @JSName("line")
  def line_Datum[Datum](): Line[Datum] = js.native
  def linkHorizontal(): Link[_, DefaultLinkObject, js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("linkHorizontal")
  def linkHorizontal_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkHorizontal")
  def linkHorizontal_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link[This, LinkDatum, NodeDatum] = js.native
  def linkRadial(): LinkRadial[_, DefaultLinkObject, js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("linkRadial")
  def linkRadial_LinkDatumNodeDatum[LinkDatum, NodeDatum](): LinkRadial[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkRadial")
  def linkRadial_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): LinkRadial[This, LinkDatum, NodeDatum] = js.native
  def linkVertical(): Link[_, DefaultLinkObject, js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("linkVertical")
  def linkVertical_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link[_, LinkDatum, NodeDatum] = js.native
  @JSName("linkVertical")
  def linkVertical_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link[This, LinkDatum, NodeDatum] = js.native
  def pie(): Pie[_, scala.Double | d3DashShapeLib.Anon_ValueOf] = js.native
  @JSName("pie")
  def pie_Datum[Datum](): Pie[_, Datum] = js.native
  @JSName("pie")
  def pie_ThisDatum[This, Datum](): Pie[This, Datum] = js.native
  def pointRadial(angle: scala.Double, radius: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def radialArea(): RadialArea[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("radialArea")
  def radialArea_Datum[Datum](): RadialArea[Datum] = js.native
  def radialLine(): RadialLine[js.Tuple2[scala.Double, scala.Double]] = js.native
  @JSName("radialLine")
  def radialLine_Datum[Datum](): RadialLine[Datum] = js.native
  def stack(): Stack[_, ScalablyTyped.runtime.StringDictionary[scala.Double], java.lang.String] = js.native
  def stackOffsetDiverging(series: Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetExpand(series: Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetNone(series: Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetSilhouette(series: Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOffsetWiggle(series: Series[_, _], order: js.Array[scala.Double]): scala.Unit = js.native
  def stackOrderAscending(series: Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderDescending(series: Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderInsideOut(series: Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderNone(series: Series[_, _]): js.Array[scala.Double] = js.native
  def stackOrderReverse(series: Series[_, _]): js.Array[scala.Double] = js.native
  @JSName("stack")
  def stack_Datum[Datum](): Stack[_, Datum, java.lang.String] = js.native
  @JSName("stack")
  def stack_DatumKey[Datum, Key](): Stack[_, Datum, Key] = js.native
  @JSName("stack")
  def stack_ThisDatumKey[This, Datum, Key](): Stack[This, Datum, Key] = js.native
  def symbol(): Symbol[_, _] = js.native
  @JSName("symbol")
  def symbol_Datum[Datum](): Symbol[_, Datum] = js.native
  @JSName("symbol")
  def symbol_ThisDatum[This, Datum](): Symbol[This, Datum] = js.native
}

