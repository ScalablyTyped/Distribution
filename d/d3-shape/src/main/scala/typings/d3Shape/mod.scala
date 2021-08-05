package typings.d3Shape

import org.scalablytyped.runtime.StringDictionary
import typings.d3Path.mod.Path_
import typings.d3Shape.anon.ValueOf
import typings.std.Array
import typings.std.CanvasRenderingContext2D
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arc(): Arc_[js.Any, DefaultArcObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[js.Any, DefaultArcObject]]
  
  inline def arc_Datum[Datum](): Arc_[js.Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[js.Any, Datum]]
  
  inline def arc_ThisDatum[This, Datum](): Arc_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[This, Datum]]
  
  inline def area[Datum](): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")().asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any]).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double], y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Double,
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Unit,
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any]).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Double, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Unit, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Double, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Unit, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  
  inline def areaRadial(): AreaRadial_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("areaRadial")().asInstanceOf[AreaRadial_[js.Tuple2[Double, Double]]]
  
  inline def areaRadial_Datum[Datum](): AreaRadial_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("areaRadial")().asInstanceOf[AreaRadial_[Datum]]
  
  @JSImport("d3-shape", "curveBasis")
  @js.native
  val curveBasis: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveBasisClosed")
  @js.native
  val curveBasisClosed: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveBasisOpen")
  @js.native
  val curveBasisOpen: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveBundle")
  @js.native
  val curveBundle: CurveBundleFactory = js.native
  
  @JSImport("d3-shape", "curveCardinal")
  @js.native
  val curveCardinal: CurveCardinalFactory = js.native
  
  @JSImport("d3-shape", "curveCardinalClosed")
  @js.native
  val curveCardinalClosed: CurveCardinalFactory = js.native
  
  @JSImport("d3-shape", "curveCardinalOpen")
  @js.native
  val curveCardinalOpen: CurveCardinalFactory = js.native
  
  @JSImport("d3-shape", "curveCatmullRom")
  @js.native
  val curveCatmullRom: CurveCatmullRomFactory = js.native
  
  @JSImport("d3-shape", "curveCatmullRomClosed")
  @js.native
  val curveCatmullRomClosed: CurveCatmullRomFactory = js.native
  
  @JSImport("d3-shape", "curveCatmullRomOpen")
  @js.native
  val curveCatmullRomOpen: CurveCatmullRomFactory = js.native
  
  @JSImport("d3-shape", "curveLinear")
  @js.native
  val curveLinear: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveLinearClosed")
  @js.native
  val curveLinearClosed: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveMonotoneX")
  @js.native
  val curveMonotoneX: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveMonotoneY")
  @js.native
  val curveMonotoneY: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveNatural")
  @js.native
  val curveNatural: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveStep")
  @js.native
  val curveStep: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveStepAfter")
  @js.native
  val curveStepAfter: CurveFactory = js.native
  
  @JSImport("d3-shape", "curveStepBefore")
  @js.native
  val curveStepBefore: CurveFactory = js.native
  
  inline def line[Datum](): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")().asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any]).asInstanceOf[Line_[Datum]]
  inline def line[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double], y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any]).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double, y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double, y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Unit, y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Unit, y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  
  inline def lineRadial(): LineRadial_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lineRadial")().asInstanceOf[LineRadial_[js.Tuple2[Double, Double]]]
  
  inline def lineRadial_Datum[Datum](): LineRadial_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("lineRadial")().asInstanceOf[LineRadial_[Datum]]
  
  inline def linkHorizontal(): Link[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkHorizontal_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link[js.Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link[js.Any, LinkDatum, NodeDatum]]
  
  inline def linkHorizontal_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link[This, LinkDatum, NodeDatum]]
  
  inline def linkRadial(): LinkRadial_[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkRadial_LinkDatumNodeDatum[LinkDatum, NodeDatum](): LinkRadial_[js.Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[js.Any, LinkDatum, NodeDatum]]
  
  inline def linkRadial_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): LinkRadial_[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[This, LinkDatum, NodeDatum]]
  
  inline def linkVertical(): Link[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link[js.Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkVertical_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link[js.Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link[js.Any, LinkDatum, NodeDatum]]
  
  inline def linkVertical_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link[This, LinkDatum, NodeDatum]]
  
  inline def pie(): Pie_[js.Any, Double | ValueOf] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[js.Any, Double | ValueOf]]
  
  inline def pie_Datum[Datum](): Pie_[js.Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[js.Any, Datum]]
  
  inline def pie_ThisDatum[This, Datum](): Pie_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[This, Datum]]
  
  inline def pointRadial(angle: Double, radius: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointRadial")(angle.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def radialArea(): RadialArea_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialArea")().asInstanceOf[RadialArea_[js.Tuple2[Double, Double]]]
  
  inline def radialArea_Datum[Datum](): RadialArea_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialArea")().asInstanceOf[RadialArea_[Datum]]
  
  inline def radialLine(): RadialLine_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialLine")().asInstanceOf[RadialLine_[js.Tuple2[Double, Double]]]
  
  inline def radialLine_Datum[Datum](): RadialLine_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialLine")().asInstanceOf[RadialLine_[Datum]]
  
  inline def stack(): Stack_[js.Any, StringDictionary[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[js.Any, StringDictionary[Double], String]]
  
  inline def stackOffsetDiverging(series: Series[js.Any, js.Any], order: Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetDiverging")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetExpand(series: Series[js.Any, js.Any], order: Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetExpand")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetNone(series: Series[js.Any, js.Any], order: Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetNone")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetSilhouette(series: Series[js.Any, js.Any], order: Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetSilhouette")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetWiggle(series: Series[js.Any, js.Any], order: Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetWiggle")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOrderAppearance(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderAppearance")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderAscending(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderAscending")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderDescending(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderDescending")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderInsideOut(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderInsideOut")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderNone(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderNone")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderReverse(series: Series[js.Any, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderReverse")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stack_Datum[Datum](): Stack_[js.Any, Datum, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[js.Any, Datum, String]]
  
  inline def stack_DatumKey[Datum, Key](): Stack_[js.Any, Datum, Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[js.Any, Datum, Key]]
  
  inline def stack_ThisDatumKey[This, Datum, Key](): Stack_[This, Datum, Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[This, Datum, Key]]
  
  inline def symbol[Datum](): Symbol_[js.Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](`type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType]): Symbol_[js.Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](
    `type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](
    `type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: Double
  ): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](
    `type`: Unit,
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](`type`: Unit, size: Double): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](`type`: SymbolType): Symbol_[js.Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](
    `type`: SymbolType,
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  inline def symbol[Datum](`type`: SymbolType, size: Double): Symbol_[js.Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[js.Any, Datum]]
  
  @JSImport("d3-shape", "symbolCircle")
  @js.native
  val symbolCircle: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolCross")
  @js.native
  val symbolCross: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolDiamond")
  @js.native
  val symbolDiamond: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolSquare")
  @js.native
  val symbolSquare: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolStar")
  @js.native
  val symbolStar: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolTriangle")
  @js.native
  val symbolTriangle: SymbolType = js.native
  
  @JSImport("d3-shape", "symbolWye")
  @js.native
  val symbolWye: SymbolType = js.native
  
  inline def symbol_ThisDatum[This, Datum](): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType]): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: Double
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: Unit,
    size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: Unit, size: Double): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: SymbolType): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: SymbolType,
    size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: SymbolType, size: Double): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  
  @JSImport("d3-shape", "symbols")
  @js.native
  val symbols: js.Array[SymbolType] = js.native
  
  @js.native
  trait Arc_[This, Datum] extends StObject {
    
    /**
      * Generates an arc for the given arguments.
      *
      * IMPORTANT: If the rendering context of the arc generator is null,
      * then the arc is returned as a path data string.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * @param d The datum for which the arc is to be generated.
      */
    def apply(d: Datum, args: js.Any*): String | Null = js.native
    
    /**
      * Computes the midpoint [x, y] of the center line of the arc that would be generated by the given arguments.
      *
      * To be consistent with the generated arc, the accessors must be deterministic, i.e., return the same value given the same arguments.
      * The midpoint is defined as (startAngle + endAngle) / 2 and (innerRadius + outerRadius) / 2.
      *
      * Note that this is not the geometric center of the arc, which may be outside the arc;
      * this method is merely a convenience for positioning labels.
      *
      * The method is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that are passed into the arc generator.
      *
      * @param d The datum for which the arc is to be generated.
      */
    def centroid(d: Datum, args: js.Any*): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this arc generator.
      *
      * A path data string representing the generated arc will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this arc generator.
      *
      * If the context is not null, then the generated arc is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current corner radius accessor, which defaults to a function returning a constant value of zero.
      */
    def cornerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the corner radius to the specified function and returns this arc generator.
      *
      * The corner radius may not be larger than (outerRadius - innerRadius) / 2.
      * In addition, for arcs whose angular span is less than π, the corner radius may be reduced as two adjacent rounded corners intersect.
      * This is occurs more often with the inner corners.
      *
      * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def cornerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the corner radius to the specified number and returns this arc generator.
      *
      * If the corner radius is greater than zero, the corners of the arc are rounded using circles of the given radius.
      * For a circular sector, the two outer corners are rounded; for an annular sector, all four corners are rounded.
      *
      * The corner radius may not be larger than (outerRadius - innerRadius) / 2.
      * In addition, for arcs whose angular span is less than π, the corner radius may be reduced as two adjacent rounded corners intersect.
      * This is occurs more often with the inner corners.
      *
      * @param radius Constant radius.
      */
    def cornerRadius(radius: Double): this.type = js.native
    
    /**
      * Returns the current end angle accessor, which defaults to a function returning the endAngle property
      * of the first argument passed into it.
      */
    def endAngle(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the end angle to the specified function and returns this arc generator.
      *
      * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
      *
      * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def endAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the end angle to the specified number and returns this arc generator.
      *
      * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
      *
      * @param angle Constant angle in radians.
      */
    def endAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current inner radius accessor, which defaults to a function returning the innerRadius property
      * of the first argument passed into it.
      */
    def innerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the inner radius to the specified function and returns this arc generator.
      *
      * Specifying the inner radius as a function is useful for constructing a stacked polar bar chart, often in conjunction with a sqrt scale.
      * More commonly, a constant inner radius is used for a donut or pie chart. If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
      * A negative value is treated as zero.
      *
      * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def innerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the inner radius to the specified number and returns this arc generator.
      *
      * Specifying the inner radius as a function is useful for constructing a stacked polar bar chart, often in conjunction with a sqrt scale.
      * More commonly, a constant inner radius is used for a donut or pie chart. If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
      * A negative value is treated as zero.
      *
      * @param radius Constant radius.
      */
    def innerRadius(radius: Double): this.type = js.native
    
    /**
      * Returns the current outer radius accessor, which defaults to a function returning the outerRadius property
      * of the first argument passed into it.
      */
    def outerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the outer radius to the specified function and returns this arc generator.
      *
      * Specifying the outer radius as a function is useful for constructing a coxcomb or polar bar chart,
      * often in conjunction with a sqrt scale. More commonly, a constant outer radius is used for a pie or donut chart.
      * If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
      * A negative value is treated as zero.
      *
      * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def outerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the outer radius to the specified number and returns this arc generator.
      *
      * Specifying the outer radius as a function is useful for constructing a coxcomb or polar bar chart,
      * often in conjunction with a sqrt scale. More commonly, a constant outer radius is used for a pie or donut chart.
      * If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
      * A negative value is treated as zero.
      *
      * @param radius Constant radius.
      */
    def outerRadius(radius: Double): this.type = js.native
    
    /**
      * Sets the pad angle to the specified number and returns this arc generator.
      *
      * The pad angle is converted to a fixed linear distance separating adjacent arcs, defined as padRadius * padAngle. This distance is subtracted equally from the start and end of the arc.
      * If the arc forms a complete circle or annulus, as when |endAngle - startAngle| ≥ τ, the pad angle is ignored. If the inner radius or angular span is small relative to the pad angle,
      * it may not be possible to maintain parallel edges between adjacent arcs. In this case, the inner edge of the arc may collapse to a point, similar to a circular sector.
      * For this reason, padding is typically only applied to annular sectors (i.e., when innerRadius is positive).
      *
      * The recommended minimum inner radius when using padding is outerRadius * padAngle / sin(θ), where θ is the angular span of the smallest arc before padding.
      * For example, if the outer radius is 200 pixels and the pad angle is 0.02 radians, a reasonable θ is 0.04 radians, and a reasonable inner radius is 100 pixels.
      *
      * Often, the pad angle is not set directly on the arc generator, but is instead computed by the pie generator so as to ensure that the area of padded arcs is proportional to their value;
      * see pie.padAngle. See the pie padding animation for illustration.
      * If you apply a constant pad angle to the arc generator directly, it tends to subtract disproportionately from smaller arcs, introducing distortion.
      *
      * @param angle Constant angle in radians.
      */
    def padAngle(): this.type = js.native
    /**
      * Sets the pad angle to the specified function and returns this arc generator.
      *
      * The pad angle is converted to a fixed linear distance separating adjacent arcs, defined as padRadius * padAngle. This distance is subtracted equally from the start and end of the arc.
      * If the arc forms a complete circle or annulus, as when |endAngle - startAngle| ≥ τ, the pad angle is ignored. If the inner radius or angular span is small relative to the pad angle,
      * it may not be possible to maintain parallel edges between adjacent arcs. In this case, the inner edge of the arc may collapse to a point, similar to a circular sector.
      * For this reason, padding is typically only applied to annular sectors (i.e., when innerRadius is positive).
      *
      * The recommended minimum inner radius when using padding is outerRadius * padAngle / sin(θ), where θ is the angular span of the smallest arc before padding.
      * For example, if the outer radius is 200 pixels and the pad angle is 0.02 radians, a reasonable θ is 0.04 radians, and a reasonable inner radius is 100 pixels.
      *
      * Often, the pad angle is not set directly on the arc generator, but is instead computed by the pie generator so as to ensure that the area of padded arcs is proportional to their value;
      * see pie.padAngle. See the pie padding animation for illustration.
      * If you apply a constant pad angle to the arc generator directly, it tends to subtract disproportionately from smaller arcs, introducing distortion.
      *
      * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def padAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.UndefOr[Double]]): this.type = js.native
    def padAngle(angle: Double): this.type = js.native
    /**
      * Returns the current pad angle accessor, which defaults to a function returning the padAngle property
      * of the first argument passed into it, or false if no data are passed in or the property is not defined.
      */
    @JSName("padAngle")
    def padAngle_ThisFunction2(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.UndefOr[Double]] = js.native
    
    /**
      * Returns the current pad radius accessor, which defaults to null, indicating that the pad radius should be automatically computed as sqrt(innerRadius * innerRadius + outerRadius * outerRadius).
      */
    def padRadius(): (js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]) | Null = js.native
    /*
      * Sets the pad radius to the specified function, and returns this arc generator.
      *
      * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def padRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the pad radius to the specified number, and returns this arc generator.
      *
      * The pad radius determines the fixed linear distance separating adjacent arcs, defined as padRadius * padAngle.
      *
      * @param radius A constant radius.
      */
    def padRadius(radius: Double): this.type = js.native
    /**
      * Sets the pad radius to null indicating that the pad radius should be automatically computed as sqrt(innerRadius * innerRadius + outerRadius * outerRadius), and returns this arc generator.
      *
      * The pad radius determines the fixed linear distance separating adjacent arcs, defined as padRadius * padAngle.
      *
      * @param radius null to set automatic pad radius calculation.
      */
    def padRadius(radius: Null): this.type = js.native
    
    /**
      * Returns the current start angle accessor, which defaults to a function returning the startAngle property
      * of the first argument passed into it.
      */
    def startAngle(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the start angle to the specified function and returns this arc generator.
      *
      * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
      *
      * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the arc generator.
      */
    def startAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the start angle to the specified number and returns this arc generator.
      *
      * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
      *
      * @param angle Constant angle in radians.
      */
    def startAngle(angle: Double): this.type = js.native
  }
  
  @js.native
  trait AreaRadial_[Datum] extends StObject {
    
    def apply(data: js.Array[Datum]): String | Null = js.native
    /**
      * Generates a radial area for the given array of data.
      *
      * IMPORTANT: If the rendering context of the radial area generator is null,
      * then the radial area is returned as a path data string.
      *
      * @param data Array of data elements.
      */
    def apply(data: Iterable[Datum]): String | Null = js.native
    
    /**
      * Returns the current startAngle accessor. The default startAngle accessor is a function returning the first element of a
      * two-element array of numbers.
      */
    def angle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets startAngle to the specified function angle and endAngle to null and returns this radial area generator.
      *
      * The default startAngle accessor assumes that the input data are two-element arrays of numbers and returns the first element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param angle An accessor function returning a value to be used for startAngle in radians with 0 at -y (12 o’clock).
      * The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def angle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets startAngle to a constant number angle and endAngle to null and returns this radial area generator.
      *
      * Setting endAngle to null indicates that the previously-computed startAngle value should be reused for the endAngle value.
      *
      * @param angle A constant value in radians with 0 at -y (12 o’clock).
      */
    def angle(angle: Double): this.type = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this radial area generator.
      *
      * A path data string representing the generated radial area will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this radial area generator.
      *
      * If the context is not null, then the generated radial area is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      */
    def curve(): CurveFactory = js.native
    /**
      * Sets the curve factory and returns this radial area generator.
      *
      * Note that curveMonotoneX or curveMonotoneY are not recommended for radial areas because they assume that the data is monotonic in x or y, which is typically untrue of radial areas.
      *
      * @param curve A valid curve factory.
      */
    def curve(curve: CurveFactory): this.type = js.native
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      *
      * The generic allows to cast the curve factory to a specific type, if known.
      */
    @JSName("curve")
    def curve_C_CurveFactory_C[C /* <: CurveFactory */](): C = js.native
    
    /**
      * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
      */
    def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
    /**
      * Sets the defined accessor to the specified function and returns this radial area generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a radial area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the startAngle, endAngle, innerRadius and outerRadius accessors will subsequently be evaluated and the point will be added to the current area segment.
      *
      * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
      * As a result, the generated area may have several discrete segments.
      *
      * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
    /**
      * Sets the defined accessor to the specified boolean and returns this radial area generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a radial area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the startAngle, endAngle, innerRadius and outerRadius accessors will subsequently be evaluated and the point will be added to the current area segment.
      *
      * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
      * As a result, the generated area may have several discrete segments.
      *
      * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined A boolean constant.
      */
    def defined(defined: Boolean): this.type = js.native
    
    /**
      * Returns the current endAngle accessor, which defaults to null, indicating that the previously-computed startAngle value should be reused for the endAngle value.
      */
    def endAngle(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
    /**
      * Sets endAngle to the specified function and returns this radial area generator.
      *
      * The default endAngle accessor is null, indicating that the previously-computed startAngle value should be reused for the endAngle value.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param angle An accessor function returning a value to be used for endAngle in radians with 0 at -y (12 o’clock).
      * The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def endAngle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets endAngle to a constant number and returns this radial area generator.
      *
      * @param angle A constant value in radians with 0 at -y (12 o’clock).
      */
    def endAngle(angle: Double): this.type = js.native
    /**
      * Sets endAngle to null and returns this radial area generator.
      *
      * Setting endAngle to null indicates that the previously-computed startAngle value should be reused for the endAngle value.
      *
      * @param angle null.
      */
    def endAngle(angle: Null): this.type = js.native
    
    /**
      * Returns the current innerRadius accessor. The default innerRadius accessor is a function a constant value of zero.
      */
    def innerRadius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets innerRadius to the specified function and returns this radial area generator.
      *
      * The default innerRadius accessor is a function which returns a constant value of zero.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param radius An accessor function returning a value to be used for innerRadius. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def innerRadius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets innerRadius to a constant number and returns this radial area generator.
      *
      * @param radius A constant value.
      */
    def innerRadius(radius: Double): this.type = js.native
    
    /**
      * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
      * The line’s angle accessor is this area’s end angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
      */
    def lineEndAngle(): LineRadial_[Datum] = js.native
    
    /**
      * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
      * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
      */
    def lineInnerRadius(): LineRadial_[Datum] = js.native
    
    /**
      * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
      * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s outer radius accessor.
      */
    def lineOuterRadius(): LineRadial_[Datum] = js.native
    
    /**
      * Returns a new radial line generator that has this radial area generator’s current defined accessor, curve and context.
      * The line’s angle accessor is this area’s start angle accessor, and the line’s radius accessor is this area’s inner radius accessor.
      */
    def lineStartAngle(): LineRadial_[Datum] = js.native
    
    /**
      * Returns the current outerRadius accessor or null. The default outerRadius accessor is a function returning the second element of a
      * two-element array of numbers.
      *
      * If the outerRadius accessor is null, the previously-computed innerRadius value is reused for the outerRadius value.
      */
    def outerRadius(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
    /**
      * Sets outerRadius to the specified function and returns this radial area generator.
      *
      * The default outerRadius accessor assumes that the input data are two-element arrays of numbers and returns the second element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param radius An accessor function returning a value to be used for outerRadius. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def outerRadius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets outerRadius to a constant number and returns this radial area generator.
      *
      * @param radius A constant value.
      */
    def outerRadius(radius: Double): this.type = js.native
    /**
      * Sets outerRadius to null and returns this radial area generator.
      *
      * Setting outerRadius to null indicates that the previously-computed innerRadius value should be reused for the outerRadius value.
      *
      * @param radius null.
      */
    def outerRadius(radius: Null): this.type = js.native
    
    /**
      * Returns the current innerRadius accessor. The default innerRadius accessor is a function returning a constant value of zero.
      */
    def radius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets innerRadius to the accessor function radius and outerRadius to null and returns this radial area generator.
      *
      * The default innerRadius accessor returns a constant value of zero.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param radius An accessor function returning a value to be used for innerRadius. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def radius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets innerRadius to a constant number radius and outerRadius to null and returns this radial area generator.
      *
      * Setting outerRadius to null indicates that the previously-computed innerRadius value should be reused for the outerRadius value.
      *
      * @param radius A constant value to be used for innerRadius.
      */
    def radius(radius: Double): this.type = js.native
    
    /**
      * Returns the current startAngle accessor. The default startAngle accessor is a function returning the first element of a
      * two-element array of numbers.
      */
    def startAngle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets startAngle to the specified function and returns this radial area generator.
      *
      * The default startAngle accessor assumes that the input data are two-element arrays of numbers and returns the first element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param angle An accessor function returning a value to be used for startAngle in radians with 0 at -y (12 o’clock).
      * The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def startAngle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets startAngle to a constant number and returns this radial area generator.
      *
      * @param angle A constant value in radians with 0 at -y (12 o’clock).
      */
    def startAngle(angle: Double): this.type = js.native
  }
  
  @js.native
  trait Area_[Datum] extends StObject {
    
    def apply(data: js.Array[Datum]): String | Null = js.native
    /**
      * Generates an area for the given array of data. Depending on this area generator’s associated curve,
      * the given input data may need to be sorted by x-value before being passed to the area generator.
      *
      * IMPORTANT: If the rendering context of the area generator is null,
      * then the area is returned as a path data string.
      *
      * @param data Array of data elements.
      */
    def apply(data: Iterable[Datum]): String | Null = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this area generator.
      *
      * A path data string representing the generated area will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this area generator.
      *
      * If the context is not null, then the generated area is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      */
    def curve(): CurveFactory = js.native
    /**
      * Sets the curve factory and returns this area generator.
      *
      * @param curve A valid curve factory.
      */
    def curve(curve: CurveFactory): this.type = js.native
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      *
      * The generic allows to cast the curve factory to a specific type, if known.
      */
    @JSName("curve")
    def curve_C_CurveFactory_C[C /* <: CurveFactory */](): C = js.native
    
    /**
      * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
      */
    def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
    /**
      * Sets the defined accessor to the specified function and returns this area generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      * When an area is generated, the defined accessor will be invoked for each element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the x0, x1, y0 and y1 accessors will subsequently be evaluated and the point will be added to the current area segment.
      * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
      * As a result, the generated area may have several discrete segments.
      *
      * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
    /**
      * Sets the defined accessor to the specified boolean and returns this area generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      * When an area is generated, the defined accessor will be invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the x0, x1, y0 and y1 accessors will subsequently be evaluated and the point will be added to the current area segment.
      * Otherwise, the element will be skipped, the current area segment will be ended, and a new area segment will be generated for the next defined point.
      * As a result, the generated area may have several discrete segments.
      *
      * Note that if an area segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined A boolean constant.
      */
    def defined(defined: Boolean): this.type = js.native
    
    /**
      * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
      * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y0-accessor.
      */
    def lineX0(): Line_[Datum] = js.native
    
    /**
      * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
      * The line’s x-accessor is this area’s x1-accessor, and the line’s y-accessor is this area’s y0-accessor.
      */
    def lineX1(): Line_[Datum] = js.native
    
    /**
      * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
      * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y0-accessor.
      */
    def lineY0(): Line_[Datum] = js.native
    
    /**
      * Returns a new line generator that has this area generator’s current defined accessor, curve and context.
      * The line’s x-accessor is this area’s x0-accessor, and the line’s y-accessor is this area’s y1-accessor.
      */
    def lineY1(): Line_[Datum] = js.native
    
    /**
      * Returns the current x0 accessor. The default x0 accessor is a function returning the first element of a
      * two-element array of numbers.
      */
    def x(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets x0 to the specified function x and x1 to null and returns this area generator.
      *
      * The default x0 accessor assumes that the input data are two-element arrays of numbers and returns the first element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param x An accessor function returning a value to be used for x0. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def x(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets x0 to a constant number x and x1 to null and returns this area generator.
      *
      * Setting x1 to null indicates that the previously-computed x0 value should be reused for the x1 value.
      *
      * @param x A constant value to be used for x0.
      */
    def x(x: Double): this.type = js.native
    
    /**
      * Returns the current x0 accessor. The default x0 accessor is a function returning the first element of a
      * two-element array of numbers.
      */
    def x0(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets x0 to the specified function and returns this area generator.
      *
      * The default x0 accessor assumes that the input data are two-element arrays of numbers and returns the first element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param x An accessor function returning a value to be used for x0. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def x0(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets x0 to a constant number and returns this area generator.
      *
      * @param x A constant value.
      */
    def x0(x: Double): this.type = js.native
    
    /**
      * Returns the current x1 accessor, which defaults to null, indicating that the previously-computed x0 value should be reused for the x1 value.
      */
    def x1(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
    /**
      * Sets x1 to the specified function and returns this area generator.
      *
      * The default x1 accessor is null, indicating that the previously-computed x0 value should be reused for the x1 value.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param x An accessor function returning a value to be used for x1. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def x1(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets x1 to a constant number and returns this area generator.
      *
      * @param x A constant value.
      */
    def x1(x: Double): this.type = js.native
    /**
      * Sets x1 to null and returns this area generator.
      *
      * Setting x1 to null indicates that the previously-computed x0 value should be reused for the x1 value.
      *
      * @param x null.
      */
    def x1(x: Null): this.type = js.native
    
    /**
      * Returns the current y0 accessor. The default y0 accessor is a function returning a constant value of zero.
      */
    def y(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets y0 to the accessor function y and y1 to null and returns this area generator.
      *
      * The default y0 accessor returns a constant value of zero.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param y An accessor function returning a value to be used for y0. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def y(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets y0 to a constant number y and y1 to null and returns this area generator.
      *
      * Setting y1 to null indicates that the previously-computed y0 value should be reused for the y1 value.
      *
      * @param y A constant value to be used for y0.
      */
    def y(y: Double): this.type = js.native
    
    /**
      * Returns the current y0 accessor. The default y0 accessor is a function a constant value of zero.
      */
    def y0(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets y0 to the specified function and returns this area generator.
      *
      * The default y0 accessor is a function which returns a constant value of zero.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param y An accessor function returning a value to be used for y0. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def y0(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets y0 to a constant number and returns this area generator.
      *
      * @param y A constant value.
      */
    def y0(y: Double): this.type = js.native
    
    /**
      * Returns the current y1 accessor or null. The default y1 accessor is a function returning the second element of a
      * two-element array of numbers.
      *
      * If the y1 accessor is null, the previously-computed y0 value is reused for the y1 value.
      */
    def y1(): (js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]) | Null = js.native
    /**
      * Sets y1 to the specified function and returns this area generator.
      *
      * The default y1 accessor assumes that the input data are two-element arrays of numbers and returns the second element.
      * If your data are in a different format, or if you wish to transform the data before rendering, then you should specify a custom accessor.
      *
      * @param y An accessor function returning a value to be used for y1. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def y1(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets y1 to a constant number and returns this area generator.
      *
      * @param y A constant value.
      */
    def y1(y: Double): this.type = js.native
    /**
      * Sets y1 to null and returns this area generator.
      *
      * Setting y1 to null indicates that the previously-computed y0 value should be reused for the y1 value.
      *
      * @param y null.
      */
    def y1(y: Null): this.type = js.native
  }
  
  @js.native
  trait CanvasPathD3Shape extends StObject {
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double
    ): Unit = js.native
    def ellipse(
      x: Double,
      y: Double,
      radiusX: Double,
      radiusY: Double,
      rotation: Double,
      startAngle: Double,
      endAngle: Double,
      anticlockwise: Boolean
    ): Unit = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
    
    def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  }
  
  @js.native
  trait CurveBundleFactory extends CurveFactoryLineOnly {
    
    /**
      * Returns a bundle curve factory with the specified beta in the range [0, 1], representing the bundle strength.
      * If beta equals zero, a straight line between the first and last point is produced; if beta equals one,
      * a standard basis spline is produced.
      *
      * @param beta A constant value in the [0, 1] interval.
      */
    def beta(beta: Double): this.type = js.native
  }
  
  @js.native
  trait CurveCardinalFactory extends CurveFactory {
    
    /**
      * Returns a cardinal curve factory with the specified tension in the range [0, 1].
      * The tension determines the length of the tangents: a tension of one yields all zero tangents, equivalent to curveLinear; a tension of zero produces a uniform Catmull–Rom spline.
      *
      * @param tension A constant in the [0, 1] interval.
      */
    def tension(tension: Double): this.type = js.native
  }
  
  @js.native
  trait CurveCatmullRomFactory extends CurveFactory {
    
    /**
      * Returns a cubic Catmull–Rom curve factory with the specified alpha in the range [0, 1].
      * If alpha is zero, produces a uniform spline, equivalent to curveCardinal with a tension of zero;
      * if alpha is one, produces a chordal spline; if alpha is 0.5, produces a centripetal spline.
      * Centripetal splines are recommended to avoid self-intersections and overshoot.
      *
      * @param alpha A constant in the [0, 1] interval.
      */
    def alpha(alpha: Double): this.type = js.native
  }
  
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[/* context */ CanvasRenderingContext2D | Path_, CurveGenerator]
  
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[/* context */ CanvasRenderingContext2D | Path_, CurveGeneratorLineOnly]
  
  trait CurveGenerator
    extends StObject
       with CurveGeneratorLineOnly {
    
    /**
      * Indicates the end of the current area segment.
      */
    def areaEnd(): Unit
    
    /**
      * Indicates the start of a new area segment.
      * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
      */
    def areaStart(): Unit
  }
  object CurveGenerator {
    
    inline def apply(
      areaEnd: () => Unit,
      areaStart: () => Unit,
      lineEnd: () => Unit,
      lineStart: () => Unit,
      point: (Double, Double) => Unit
    ): CurveGenerator = {
      val __obj = js.Dynamic.literal(areaEnd = js.Any.fromFunction0(areaEnd), areaStart = js.Any.fromFunction0(areaStart), lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
      __obj.asInstanceOf[CurveGenerator]
    }
    
    extension [Self <: CurveGenerator](x: Self) {
      
      inline def setAreaEnd(value: () => Unit): Self = StObject.set(x, "areaEnd", js.Any.fromFunction0(value))
      
      inline def setAreaStart(value: () => Unit): Self = StObject.set(x, "areaStart", js.Any.fromFunction0(value))
    }
  }
  
  trait CurveGeneratorLineOnly extends StObject {
    
    /**
      * Indicates the end of the current line segment.
      */
    def lineEnd(): Unit
    
    /**
      * Indicates the start of a new line segment. Zero or more points will follow.
      */
    def lineStart(): Unit
    
    /**
      * Indicates a new point in the current line segment with the given x- and y-values.
      */
    def point(x: Double, y: Double): Unit
  }
  object CurveGeneratorLineOnly {
    
    inline def apply(lineEnd: () => Unit, lineStart: () => Unit, point: (Double, Double) => Unit): CurveGeneratorLineOnly = {
      val __obj = js.Dynamic.literal(lineEnd = js.Any.fromFunction0(lineEnd), lineStart = js.Any.fromFunction0(lineStart), point = js.Any.fromFunction2(point))
      __obj.asInstanceOf[CurveGeneratorLineOnly]
    }
    
    extension [Self <: CurveGeneratorLineOnly](x: Self) {
      
      inline def setLineEnd(value: () => Unit): Self = StObject.set(x, "lineEnd", js.Any.fromFunction0(value))
      
      inline def setLineStart(value: () => Unit): Self = StObject.set(x, "lineStart", js.Any.fromFunction0(value))
      
      inline def setPoint(value: (Double, Double) => Unit): Self = StObject.set(x, "point", js.Any.fromFunction2(value))
    }
  }
  
  trait DefaultArcObject extends StObject {
    
    /**
      * End angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      */
    var endAngle: Double
    
    /**
      * Inner radius of arc.
      */
    var innerRadius: Double
    
    /**
      * Outer radius of arc.
      */
    var outerRadius: Double
    
    /**
      * Optional. Pad angle of arc in radians.
      */
    var padAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Start angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      */
    var startAngle: Double
  }
  object DefaultArcObject {
    
    inline def apply(endAngle: Double, innerRadius: Double, outerRadius: Double, startAngle: Double): DefaultArcObject = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultArcObject]
    }
    
    extension [Self <: DefaultArcObject](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultLinkObject extends StObject {
    
    /**
      * Source node of the link.
      *
      * For a link in a Cartesian coordinate system, the two element array contains
      * the coordinates [x, y].
      *
      * For a radial link, the two element array contains
      * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
      * The radius measures the distance from the origin ⟨0,0⟩.
      */
    var source: js.Tuple2[Double, Double]
    
    /**
      * Target node of the link.
      *
      * For a link in a Cartesian coordinate system, the two element array contains
      * the coordinates [x, y].
      *
      * For a radial link, the two element array contains
      * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
      * The radius measures the distance from the origin ⟨0,0⟩.
      */
    var target: js.Tuple2[Double, Double]
  }
  object DefaultLinkObject {
    
    inline def apply(source: js.Tuple2[Double, Double], target: js.Tuple2[Double, Double]): DefaultLinkObject = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultLinkObject]
    }
    
    extension [Self <: DefaultLinkObject](x: Self) {
      
      inline def setSource(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LineRadial_[Datum] extends StObject {
    
    def apply(data: js.Array[Datum]): String | Null = js.native
    /**
      * Generates a radial line for the given array of data. Depending on this radial line generator’s associated curve,
      * the given input data may need to be sorted by x-value before being passed to the line generator.
      *
      * IMPORTANT: If the rendering context of the radial line generator is null,
      * then the radial line is returned as a path data string.
      *
      * @param data Array of data elements.
      */
    def apply(data: Iterable[Datum]): String | Null = js.native
    
    /**
      * Returns the current angle accessor function, which defaults to a function returning first element of a two-element array of numbers.
      */
    def angle(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the angle accessor to the specified function and returns this radial line generator.
      *
      * When a radial line is generated, the angle accessor will be invoked for each defined element in the input data array.
      *
      * The default angle accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
      * then you should specify a custom accessor.
      *
      * @param angle An angle accessor function which returns the angle value in radians, with 0 at -y (12 o’clock). The angle accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def angle(angle: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets the angle accessor to the specified number and returns this radial line generator.
      *
      * @param angle A constant angle value in radians, with 0 at -y (12 o’clock).
      */
    def angle(angle: Double): this.type = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this radial line generator.
      *
      * A path data string representing the generated radial line will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this radial line generator.
      *
      * If the context is not null, then the generated radial line is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      */
    def curve(): CurveFactory | CurveFactoryLineOnly = js.native
    /**
      * Sets the curve factory and returns this radial line generator.
      *
      * Note that curveMonotoneX or curveMonotoneY are not recommended for radial lines because they assume that the data is monotonic in x or y,
      * which is typically untrue of radial lines.
      *
      * @param curve A valid curve factory.
      */
    def curve(curve: CurveFactory | CurveFactoryLineOnly): this.type = js.native
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      *
      * The generic allows to cast the curve factory to a specific type, if known.
      */
    @JSName("curve")
    def curve_C_UnionCurveFactoryCurveFactoryLineOnly_C[C /* <: CurveFactory | CurveFactoryLineOnly */](): C = js.native
    
    /**
      * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
      */
    def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
    /**
      * Sets the defined accessor to the specified function and returns this radial line generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a radial line is generated, the defined accessor will be invoked for each element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the angle and radius accessors will subsequently be evaluated and the point will be added to the current radial line segment.
      * Otherwise, the element will be skipped, the current radial line segment will be ended, and a new radial line segment will be generated for the next defined point.
      * As a result, the generated radial line may have several discrete segments.
      *
      * Note that if a radial line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
    /**
      * Sets the defined accessor to the specified boolean and returns this radial line generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a radial line is generated, the defined accessor will be invoked for each element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the angle and radius accessors will subsequently be evaluated and the point will be added to the current radial line segment.
      * Otherwise, the element will be skipped, the current radial line segment will be ended, and a new radial line segment will be generated for the next defined point.
      * As a result, the generated radial line may have several discrete segments.
      *
      * Note that if a radial line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined A boolean constant.
      */
    def defined(defined: Boolean): this.type = js.native
    
    /**
      * Returns the current radius accessor function, which defaults to a function returning second element of a two-element array of numbers.
      */
    def radius(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the radius accessor to the specified function and returns this radial line generator.
      *
      * When a radial line is generated, the radius accessor will be invoked for each defined element in the input data array.
      *
      * The default radius accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
      * then you should specify a custom accessor.
      *
      * @param radius A radius accessor function which returns the radius value. The radius accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def radius(radius: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets the radius accessor to the specified number and returns this radial line generator.
      *
      * @param radius A constant radius value.
      */
    def radius(radius: Double): this.type = js.native
  }
  
  @js.native
  trait Line_[Datum] extends StObject {
    
    def apply(data: js.Array[Datum]): String | Null = js.native
    /**
      * Generates a line for the given array of data. Depending on this line generator’s associated curve,
      * the given input data may need to be sorted by x-value before being passed to the line generator.
      *
      * IMPORTANT: If the rendering context of the line generator is null,
      * then the line is returned as a path data string.
      *
      * @param data Array of data elements.
      */
    def apply(data: Iterable[Datum]): String | Null = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this line generator.
      *
      * A path data string representing the generated line will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this line generator.
      *
      * If the context is not null, then the generated line is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      */
    def curve(): CurveFactory | CurveFactoryLineOnly = js.native
    /**
      * Sets the curve factory and returns this line generator.
      *
      * @param curve A valid curve factory.
      */
    def curve(curve: CurveFactory | CurveFactoryLineOnly): this.type = js.native
    /**
      * Returns the current curve factory, which defaults to curveLinear.
      *
      * The generic allows to cast the curve factory to a specific type, if known.
      */
    @JSName("curve")
    def curve_C_UnionCurveFactoryCurveFactoryLineOnly_C[C /* <: CurveFactory | CurveFactoryLineOnly */](): C = js.native
    
    /**
      * Returns the current defined accessor, which defaults to a function returning a constant boolean value of true.
      */
    def defined(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean] = js.native
    /**
      * Sets the defined accessor to the specified function and returns this line generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a line is generated, the defined accessor will be invoked for each element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the x and y accessors will subsequently be evaluated and the point will be added to the current line segment.
      * Otherwise, the element will be skipped, the current line segment will be ended, and a new line segment will be generated for the next defined point.
      * As a result, the generated line may have several discrete segments.
      *
      * Note that if a line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined An accessor function which returns a boolean value. The accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def defined(defined: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Boolean]): this.type = js.native
    /**
      * Sets the defined accessor to the specified boolean and returns this line generator.
      *
      * The default accessor for defined returns a constant boolean value of true, thus assumes that the input data is always defined.
      *
      * When a line is generated, the defined accessor will be invoked for each element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      * If the given element is defined (i.e., if the defined accessor returns a truthy value for this element),
      * the x and y accessors will subsequently be evaluated and the point will be added to the current line segment.
      * Otherwise, the element will be skipped, the current line segment will be ended, and a new line segment will be generated for the next defined point.
      * As a result, the generated line may have several discrete segments.
      *
      * Note that if a line segment consists of only a single point, it may appear invisible unless rendered with rounded or square line caps.
      * In addition, some curves such as curveCardinalOpen only render a visible segment if it contains multiple points.
      *
      * @param defined A boolean constant.
      */
    def defined(defined: Boolean): this.type = js.native
    
    /**
      * Returns the current x-coordinate accessor function, which defaults to a function returning first element of a two-element array of numbers.
      */
    def x(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the x accessor to the specified function and returns this line generator.
      *
      * When a line is generated, the x accessor will be invoked for each defined element in the input data array.
      *
      * The default x accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
      * then you should specify a custom accessor.
      *
      * @param x A coordinate accessor function which returns the x-coordinate value. The x accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def x(x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets the x accessor to the specified number and returns this line generator.
      *
      * @param x A constant x-coordinate value.
      */
    def x(x: Double): this.type = js.native
    
    /**
      * Returns the current y-coordinate accessor function, which defaults to a function returning second element of a two-element array of numbers.
      */
    def y(): js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the y accessor to the specified function and returns this line generator.
      *
      * When a line is generated, the y accessor will be invoked for each defined element in the input data array.
      *
      * The default y accessor assumes that the input data are two-element arrays of numbers. If your data are in a different format, or if you wish to transform the data before rendering,
      * then you should specify a custom accessor.
      *
      * @param y A coordinate accessor function which returns the y-coordinate value. The y accessor will be invoked for each defined element in the input data array,
      * being passed the element d, the index i, and the array data as three arguments.
      */
    def y(y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets the y accessor to the specified number and returns this line generator.
      *
      * @param y A constant y-coordinate value.
      */
    def y(y: Double): this.type = js.native
  }
  
  @js.native
  trait Link[This, LinkDatum, NodeDatum] extends StObject {
    
    /**
      * Generates a link for the given arguments.
      *
      * IMPORTANT: If the rendering context of the link generator is null,
      * then the link is returned as a path data string.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * @param d The datum for which the link is to be generated.
      */
    def apply(d: LinkDatum, args: js.Any*): String | Null = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this link generator.
      *
      * A path data string representing the generated link will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this link generator.
      *
      * If the context is not null, then the generated link is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current source node accessor function.
      * The default source accessor function returns a two element array [x, y].
      */
    def source(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
    /**
      * Sets the source accessor to the specified function and returns this link generator.
      *
      * @param source Source node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the link generator. The default target accessor function returns a two element array [x, y].
      */
    def source(source: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
    
    /**
      * Returns the current target node accessor function.
      * The default target accessor function returns a two element array [x, y].
      */
    def target(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
    /**
      * Sets the target accessor to the specified function and returns this link generator.
      *
      * @param target Target node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the link generator. The default target accessor function returns a two element array [x, y].
      */
    def target(target: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
    
    /**
      * Returns the current x-accessor, which defaults to a function accepting an number array
      * as its argument an returning the first element of the array.
      */
    def x(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the x-accessor to the specified function and returns this link generator.
      *
      * @param x x-coordinate accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as its first argument a node object followed by all additional arguments that were passed into the link generator.
      */
    def x(x: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
    
    /**
      * Returns the current y-accessor, which defaults to a function accepting an number array
      * as its argument an returning the second element of the array.
      */
    def y(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the y-accessor to the specified function and returns this link generator.
      *
      * @param y y-coordinate accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as its first argument a node object followed by all additional arguments that were passed into the link generator.
      */
    def y(y: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
  }
  
  @js.native
  trait LinkRadial_[This, LinkDatum, NodeDatum] extends StObject {
    
    /**
      * Generates a radial link for the given arguments.
      *
      * IMPORTANT: If the rendering context of the radial link generator is null,
      * then the link is returned as a path data string.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * @param d The datum for which the link is to be generated.
      */
    def apply(d: LinkDatum, args: js.Any*): String | Null = js.native
    
    /**
      * Returns the current angle accessor, which defaults to a function accepting an number array
      * as its argument an returning the first element of the array.
      */
    def angle(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the angle accessor to the specified function and returns this radial link generator.
      * The angle is stated in radians, with 0 at -y (12 o’clock).
      *
      * @param angle Angle accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as its first argument a node object followed by all additional arguments that were passed into the radial link generator.
      */
    def angle(angle: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this radial link generator.
      *
      * A path data string representing the generated radial link will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this radial link generator.
      *
      * If the context is not null, then the generated radial area is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current radius accessor, which defaults to a function accepting an number array
      * as its argument an returning the second element of the array.
      */
    def radius(): js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the radius accessor to the specified function and returns this radial link generator.
      * The radius is measured as the distance from the origin ⟨0,0⟩.
      *
      * @param radius Radius accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as its first argument a node object followed by all additional arguments that were passed into the radial link generator.
      */
    def radius(radius: js.ThisFunction2[/* this */ This, /* node */ NodeDatum, /* repeated */ js.Any, Double]): this.type = js.native
    
    /**
      * Returns the current source node accessor function.
      * The default source accessor function returns a two element array [x, y].
      */
    def source(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
    /**
      * Sets the source accessor to the specified function and returns this radial link generator.
      *
      * @param source Source node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the radial link generator. The default target accessor function returns a two element array [x, y].
      */
    def source(source: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
    
    /**
      * Returns the current target node accessor function.
      * The default target accessor function returns a two element array [x, y].
      */
    def target(): js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum] = js.native
    /**
      * Sets the target accessor to the specified function and returns this radial link generator.
      *
      * @param target Target node accessor function. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the radial link generator. The default target accessor function returns a two element array [x, y].
      */
    def target(target: js.ThisFunction2[/* this */ This, /* d */ LinkDatum, /* repeated */ js.Any, NodeDatum]): this.type = js.native
  }
  
  trait PieArcDatum[T] extends StObject {
    
    /**
      * The input datum; the corresponding element in the input data array of the Pie generator.
      */
    var data: T
    
    /**
      * The end angle of the arc.
      * If the pie generator was configured to be used for the arc generator,
      * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      */
    var endAngle: Double
    
    /**
      * The zero-based sorted index of the arc.
      */
    var index: Double
    
    /**
      * The pad angle of the arc. If the pie generator was configured to be used for the arc generator, than the units are in radians.
      */
    var padAngle: Double
    
    /**
      * The start angle of the arc.
      * If the pie generator was configured to be used for the arc generator,
      * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      */
    var startAngle: Double
    
    /**
      * The numeric value of the arc.
      */
    var value: Double
  }
  object PieArcDatum {
    
    inline def apply[T](data: T, endAngle: Double, index: Double, padAngle: Double, startAngle: Double, value: Double): PieArcDatum[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieArcDatum[T]]
    }
    
    extension [Self <: PieArcDatum[?], T](x: Self & PieArcDatum[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pie_[This, Datum] extends StObject {
    
    /**
      * Generates a pie for the given array of data, returning an array of objects representing each datum’s arc angles.
      * Any additional arguments are arbitrary; they are simply propagated to the pie generator’s accessor functions along with the this object.
      * The length of the returned array is the same as data, and each element i in the returned array corresponds to the element i in the input data.
      *
      * This representation is designed to work with the arc generator’s default startAngle, endAngle and padAngle accessors.
      * The angular units are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify angles in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * @param data Array of data elements.
      */
    def apply(data: js.Array[Datum], args: js.Any*): js.Array[PieArcDatum[Datum]] = js.native
    
    /**
      * Returns the current end angle accessor, which defaults to a function returning a constant 2*pi.
      */
    def endAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the overall end angle of the pie to the specified function and returns this pie generator.
      *
      * The default end angle is 2*pi.
      *
      * The end angle here means the overall end angle of the pie, i.e., the end angle of the last arc.
      * The end angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * The value of the end angle is constrained to startAngle ± τ, such that |endAngle - startAngle| ≤ τ.
      *
      * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
      */
    def endAngle(
      angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
    ): this.type = js.native
    /**
      * Sets the overall end angle of the pie to the specified number and returns this pie generator.
      *
      * The default end angle is 2*pi.
      *
      * The end angle here means the overall end angle of the pie, i.e., the end angle of the last arc.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * The value of the end angle is constrained to startAngle ± τ, such that |endAngle - startAngle| ≤ τ.
      *
      * @param angle A constant angle.
      */
    def endAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current pad angle accessor, which defaults to a function returning a constant zero.
      */
    def padAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the pad angle to the specified function and returns this pie generator.
      *
      * The pad angle here means the angular separation between each adjacent arc.
      * The total amount of padding reserved is the specified angle times the number of elements in the input data array, and at most |endAngle - startAngle|;
      * the remaining space is then divided proportionally by value such that the relative area of each arc is preserved.
      * The pad angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator, you should specify an angle in radians.
      *
      * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
      */
    def padAngle(
      angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
    ): this.type = js.native
    /**
      * Sets the pad angle to the specified number and returns this pie generator.
      *
      * The pad angle here means the angular separation between each adjacent arc.
      * The total amount of padding reserved is the specified angle times the number of elements in the input data array, and at most |endAngle - startAngle|;
      * the remaining space is then divided proportionally by value such that the relative area of each arc is preserved.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator, you should specify an angle in radians.
      *
      * @param angle A constant angle.
      */
    def padAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current data comparator, which defaults to null.
      */
    def sort(): (js.Function2[/* a */ Datum, /* b */ Datum, Double]) | Null = js.native
    /**
      * Sets the data comparator to the specified function and returns this pie generator.
      *
      * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
      * Otherwise, the data is sorted according to the data comparator, and the resulting order is used. Setting the data comparator implicitly sets the value comparator to null.
      *
      * Sorting does not affect the order of the generated arc array which is always in the same order as the input data array; it merely affects the computed angles of each arc.
      * The first arc starts at the start angle and the last arc ends at the end angle.
      *
      * @param comparator A compare function takes two arguments a and b, each elements from the input data array.
      * If the arc for a should be before the arc for b, then the comparator must return a number less than zero;
      * if the arc for a should be after the arc for b, then the comparator must return a number greater than zero;
      * returning zero means that the relative order of a and b is unspecified.
      */
    def sort(comparator: js.Function2[/* a */ Datum, /* b */ Datum, Double]): this.type = js.native
    /**
      * Sets the data comparator to null and returns this pie generator.
      *
      * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
      *
      * @param comparator null, to set the pie generator to use the original input order or use the sortValues comparator, if any.
      */
    def sort(comparator: Null): this.type = js.native
    
    /**
      * Returns the current value comparator, which defaults to descending value.
      */
    def sortValues(): (js.Function2[/* a */ Double, /* b */ Double, Double]) | Null = js.native
    /**
      * Sets the value comparator to the specified function and returns this pie generator.
      *
      * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
      * Otherwise, the data is sorted according to the data comparator, and the resulting order is used.
      * Setting the value comparator implicitly sets the data comparator to null.
      *
      * Sorting does not affect the order of the generated arc array which is always in the same order as the input data array;
      * it merely affects the computed angles of each arc. The first arc starts at the start angle and the last arc ends at the end angle.
      *
      * @param comparator The value comparator takes two arguments a and b which are values derived from the input data array using the value accessor, not the data elements.
      * If the arc for a should be before the arc for b, then the comparator must return a number less than zero;
      * if the arc for a should be after the arc for b, then the comparator must return a number greater than zero; returning zero means that the relative order of a and b is unspecified.
      */
    def sortValues(comparator: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    /**
      * Sets the value comparator to null and returns this pie generator.
      *
      * If both the data comparator and the value comparator are null, then arcs are positioned in the original input order.
      *
      * @param comparator null, to set the pie generator to use the original input order or use the data comparator, if any.
      */
    def sortValues(comparator: Null): this.type = js.native
    
    /**
      * Returns the current start angle accessor, which defaults to a function returning a constant zero.
      */
    def startAngle(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the overall start angle of the pie to the specified function and returns this pie generator.
      *
      * The default start angle is zero.
      *
      * The start angle here means the overall start angle of the pie, i.e., the start angle of the first arc.
      * The start angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * @param angle An angle accessor function, which is invoked once, being passed the same arguments and this context as the pie generator.
      */
    def startAngle(
      angle: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, Double]
    ): this.type = js.native
    /**
      * Sets the overall start angle of the pie to the specified number and returns this pie generator.
      *
      * The default start angle is zero.
      *
      * The start angle here means the overall start angle of the pie, i.e., the start angle of the first arc.
      * The start angle accessor is invoked once, being passed the same arguments and this context as the pie generator.
      * The units of angle are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify an angle in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * @param angle A constant angle.
      */
    def startAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current value accessor, which defaults to a function returning the first argument passed into it.
      * The default value accessor assumes that the input data are numbers, or that they are coercible to numbers using valueOf.
      */
    def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the value accessor to use the specified function and returns this pie generator.
      *
      * When a pie is generated, the value accessor will be invoked for each element in the input data array.
      * The default value accessor assumes that the input data are numbers, or that they are coercible to numbers using valueOf.
      * If your data are not simply numbers, then you should specify an accessor that returns the corresponding numeric value for a given datum.
      *
      * @param value A value accessor function, which is invoked for each element in the input data array, being passed the element d, the index i, and the array data as three arguments.
      * It returns a numeric value.
      */
    def value(value: js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], Double]): this.type = js.native
    /**
      * Sets the value accessor to use the specified constant number and returns this pie generator.
      *
      * @param value Constant value to be used.
      */
    def value(value: Double): this.type = js.native
  }
  
  type RadialArea_[Datum] = AreaRadial_[Datum]
  
  type RadialLine_[Datum] = LineRadial_[Datum]
  
  type RadialLink[This, LinkDatum, NodeDatum] = LinkRadial_[This, LinkDatum, NodeDatum]
  
  @js.native
  trait Series[Datum, Key]
    extends StObject
       with Array[SeriesPoint[Datum]] {
    
    /**
      * Index of the series in the series array returned by stack generator.
      */
    var index: Double = js.native
    
    /**
      * Key of the series.
      */
    var key: Key = js.native
  }
  
  @js.native
  trait SeriesPoint[Datum]
    extends StObject
       with Array[Double] {
    
    /**
      * Corresponds to y0, the lower value (baseline).
      */
    var `0`: Double = js.native
    
    /**
      * Corresponds to y1, the upper value (topline).
      */
    var `1`: Double = js.native
    
    /**
      * The data element underlying the series point.
      */
    var data: Datum = js.native
  }
  
  @js.native
  trait Stack_[This, Datum, Key] extends StObject {
    
    /**
      * Generates a stack for the given array of data, returning an array representing each series.
      * The resulting array has one element per series. Each series in then typically passed to an area generator to render an area chart,
      * or used to construct rectangles for a bar chart.
      *
      * Any additional arguments are arbitrary; they are simply propagated to the generator’s accessor functions along with the this object.
      *
      * @param data Array of data elements.
      */
    def apply(data: Iterable[Datum], args: js.Any*): js.Array[Series[Datum, Key]] = js.native
    
    /**
      * Returns the current keys accessor, which defaults to the empty array.
      */
    def keys(): js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, js.Array[Key]] = js.native
    /**
      * Sets the keys accessor to the specified function or array and returns this stack generator.
      *
      * A series (layer) is generated for each key. Keys are typically strings, but they may be arbitrary values.
      * The series’ key is passed to the value accessor, along with each data point, to compute the point’s value.
      *
      * @param keys An accessor function returning the array of keys.
      *             The accessor function is invoked with the "this" context of the Stack generator and passed the same arguments passed into the generator.
      */
    def keys(
      keys: js.ThisFunction2[/* this */ This, /* data */ js.Array[Datum], /* repeated */ js.Any, js.Array[Key]]
    ): this.type = js.native
    /**
      * Sets the keys accessor to the specified function or array and returns this stack generator.
      *
      * A series (layer) is generated for each key. Keys are typically strings, but they may be arbitrary values.
      * The series’ key is passed to the value accessor, along with each data point, to compute the point’s value.
      *
      * @param keys An array of keys.
      */
    def keys(keys: Iterable[Key]): this.type = js.native
    
    /**
      * Returns the current offset accessor, which defaults to stackOffsetNone; this uses a zero baseline.
      */
    def offset(): js.Function2[/* series */ Series[Datum, Key], /* order */ js.Array[Double], Unit] = js.native
    /**
      * Sets the offset accessor to the specified function and returns this stack generator.
      *
      * @param offset A function which is passed the generated series array and the order index array;
      *               it is then responsible for updating the lower and upper values in the series array.
      */
    def offset(offset: js.Function2[/* series */ Series[Datum, Key], /* order */ js.Array[Double], Unit]): this.type = js.native
    /**
      * Reset the offset to use stackOffsetNone; this uses a zero baseline.
      *
      * @param offset null to set to the default stackOffsetNone.
      */
    def offset(offset: Null): this.type = js.native
    
    /**
      * Returns the current order accessor, which defaults to stackOrderNone; this uses the order given by the key accessor.
      */
    def order(): js.Function1[/* series */ Series[Datum, Key], Iterable[Double]] = js.native
    /**
      * Sets the order accessor to the specified function and returns this stack generator.
      *
      * The stack order is computed prior to the offset; thus, the lower value for all points is zero at the time the order is computed.
      * The index attribute for each series is also not set until after the order is computed.
      *
      * See stack orders for the built-in orders.
      *
      * @param order A function returning a sort order array. It is passed the generated series array and must return an array of numeric indexes representing the stack order.
      */
    def order(order: js.Function1[/* series */ Series[Datum, Key], Iterable[Double]]): this.type = js.native
    /**
      * Reset the order to use stackOrderNone; this uses the order given by the key accessor.
      *
      * @param order null to set to the default stackOrderNone.
      */
    def order(order: Null): this.type = js.native
    /**
      * Sets the order accessor to the specified array and returns this stack generator.
      *
      * The stack order is computed prior to the offset; thus, the lower value for all points is zero at the time the order is computed.
      * The index attribute for each series is also not set until after the order is computed.
      *
      * @param order An array of numeric indexes representing the stack order.
      */
    def order(order: Iterable[Double]): this.type = js.native
    
    /**
      * Returns the current value accessor, which defaults to a function return the property corresponding to the relevant key from the data element.
      *
      * Thus, by default the stack generator assumes that the input data is an array of objects, with each object exposing named properties with numeric values; see stack for an example.
      */
    def value(): js.Function4[/* d */ Datum, /* key */ Key, /* i */ Double, /* data */ js.Array[Datum], Double] = js.native
    /**
      * Sets the value accessor to the specified function and returns this stack generator.
      *
      * @param value A value accessor function which returns the numeric value for a given data element and key combination. The accessor function is invoked for each data element and key being passed
      * the datum, the key, index of the data element in the input data array, and the complete data array.
      */
    def value(
      value: js.Function4[/* d */ Datum, /* key */ Key, /* i */ Double, /* data */ js.Array[Datum], Double]
    ): this.type = js.native
    /**
      * Sets the value accessor to the specified number and returns this stack generator.
      *
      * @param value A constant value.
      */
    def value(value: Double): this.type = js.native
  }
  
  trait SymbolType extends StObject {
    
    /**
      * Renders this symbol type to the specified context with the specified size in square pixels. The context implements the CanvasPath interface.
      * (Note that this is a subset of the CanvasRenderingContext2D interface!)
      *
      * @param context A rendering context implementing CanvasPath.
      * @param size Size of the symbol to draw.
      */
    def draw(context: CanvasPathD3Shape, size: Double): Unit
  }
  object SymbolType {
    
    inline def apply(draw: (CanvasPathD3Shape, Double) => Unit): SymbolType = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw))
      __obj.asInstanceOf[SymbolType]
    }
    
    extension [Self <: SymbolType](x: Self) {
      
      inline def setDraw(value: (CanvasPathD3Shape, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Symbol_[This, Datum] extends StObject {
    
    /**
      * Generates a symbol for the given arguments.
      *
      * IMPORTANT: If the rendering context of the symbol generator is null,
      * then the symbol is returned as a path data string.
      *
      * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
      * All arguments passed into this function, will be passed to the accessor functions of the generator.
      *
      * For example, with the default settings, no arguments are needed to produce a circle with area 64 square pixels.
      *
      * @param d The datum for which the symbol is to be generated.
      */
    def apply(d: Datum, args: js.Any*): String | Null = js.native
    def apply(d: Unit, args: js.Any*): String | Null = js.native
    
    /**
      * Returns the current rendering context, which defaults to null.
      */
    def context(): CanvasRenderingContext2D | Null = js.native
    /**
      * Sets the rendering context to null and returns this symbol generator.
      *
      * A path data string representing the generated symbol will be returned when the generator is invoked with data.
      *
      * @param context null, to remove rendering context.
      */
    def context(context: Null): this.type = js.native
    /**
      * Sets the rendering context and returns this symbol generator.
      *
      * If the context is not null, then the generated symbol is rendered to this context as a sequence of path method calls.
      *
      * @param context The rendering context.
      */
    def context(context: CanvasRenderingContext2D): this.type = js.native
    
    /**
      * Returns the current size accessor, which defaults to a function returning a constant value of 64.
      */
    def size(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
    /**
      * Sets the size to the specified function and returns this symbol generator.
      *
      * Specifying the size as a function is useful for constructing a scatterplot with a size encoding.
      * If you wish to scale the symbol to fit a given bounding box, rather than by area, try SVG’s getBBox.
      *
      * @param size An accessor function returning a number to be used as a symbol size. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the symbol generator.
      */
    def size(size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
    /**
      * Sets the size to the specified number and returns this symbol generator.
      *
      * @param size A fixed size (area in square pixels).
      */
    def size(size: Double): this.type = js.native
    
    /**
      * Returns the current symbol type accessor, which defaults to a function returning the circle symbol type.
      */
    def `type`(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType] = js.native
    /**
      * Sets the symbol type to the specified function and returns this symbol generator.
      *
      * @param type An accessor function returning a symbol type. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the symbol generator. See symbols for the set of built-in symbol types.
      * To implement a custom symbol type, return an object that implements symbolType.draw.
      */
    def `type`(`type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, SymbolType]): this.type = js.native
    /**
      * Sets the symbol type to the specified symbol type and returns this symbol generator.
      *
      * @param type A constant symbol type.
      */
    def `type`(`type`: SymbolType): this.type = js.native
  }
}
