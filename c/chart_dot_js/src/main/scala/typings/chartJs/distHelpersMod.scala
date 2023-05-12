package typings.chartJs

import typings.chartJs.anon.A
import typings.chartJs.anon.Cacheable
import typings.chartJs.anon.Count
import typings.chartJs.anon.Data
import typings.chartJs.anon.Distance
import typings.chartJs.anon.Height
import typings.chartJs.anon.Hi
import typings.chartJs.anon.LineHeight
import typings.chartJs.anon.Loop
import typings.chartJs.anon.Max
import typings.chartJs.anon.Next
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.anon.Property
import typings.chartJs.anon.R
import typings.chartJs.anon.Recordlefttopbottomrightn
import typings.chartJs.anon.RecordtopLefttopRightbott
import typings.chartJs.anon.RoundedRectradiusTRBLCorn
import typings.chartJs.anon.X
import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.height
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.line
import typings.chartJs.chartJsStrings.ltr
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.rtl
import typings.chartJs.chartJsStrings.scatter
import typings.chartJs.chartJsStrings.start
import typings.chartJs.chartJsStrings.width
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.distCoreCoreDotcontrollerMod.default
import typings.chartJs.distHelpersHelpersDotcanvasMod.DrawPointOptions
import typings.chartJs.distHelpersHelpersDotcanvasMod.Things
import typings.chartJs.distHelpersHelpersDotcollectionMod.ArrayListener
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ContextProxy
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.Descriptor
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.DescriptorDefaults
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverCache
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverObjectKey
import typings.chartJs.distHelpersHelpersDotconfigDottypesMod.ResolverProxy
import typings.chartJs.distHelpersHelpersDotcoreMod.MergeOptions
import typings.chartJs.distHelpersHelpersDotrtlMod.RTLAdapter
import typings.chartJs.distHelpersHelpersDotsegmentMod.LineElement
import typings.chartJs.distHelpersHelpersDotsegmentMod.PointElement
import typings.chartJs.distHelpersHelpersDotsegmentMod.Segment
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesGeometricMod.SplinePoint
import typings.chartJs.distTypesGeometricMod.TRBL
import typings.chartJs.distTypesGeometricMod.TRBLCorners
import typings.chartJs.distTypesIndexMod.ActiveDataPoint
import typings.chartJs.distTypesIndexMod.CanvasFontSpec
import typings.chartJs.distTypesIndexMod.Chart
import typings.chartJs.distTypesIndexMod.ChartEvent
import typings.chartJs.distTypesIndexMod.ChartMeta
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.FontSpec
import typings.chartJs.distTypesIndexMod.RenderTextOpts
import typings.kurkleColor.mod.Color
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.FrameRequestCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Intl.NumberFormatOptions
import typings.std.MouseEvent
import typings.std.Record
import typings.std.Set
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("chart.js/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/helpers", "HALF_PI")
  @js.native
  val HALF_PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "INFINITY")
  @js.native
  val INFINITY: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "PI")
  @js.native
  val PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "PITAU")
  @js.native
  val PITAU: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "QUARTER_PI")
  @js.native
  val QUARTER_PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "RAD_PER_DEG")
  @js.native
  val RAD_PER_DEG: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "TAU")
  @js.native
  val TAU: Double = js.native
  
  @JSImport("chart.js/dist/helpers", "TWO_THIRDS_PI")
  @js.native
  val TWO_THIRDS_PI: Double = js.native
  
  inline def addGrace(minmax: Max, grace: String, beginAtZero: Boolean): Max = (^.asInstanceOf[js.Dynamic].applyDynamic("_addGrace")(minmax.asInstanceOf[js.Any], grace.asInstanceOf[js.Any], beginAtZero.asInstanceOf[js.Any])).asInstanceOf[Max]
  inline def addGrace(minmax: Max, grace: Double, beginAtZero: Boolean): Max = (^.asInstanceOf[js.Dynamic].applyDynamic("_addGrace")(minmax.asInstanceOf[js.Any], grace.asInstanceOf[js.Any], beginAtZero.asInstanceOf[js.Any])).asInstanceOf[Max]
  
  inline def addRoundedRectPath(ctx: CanvasRenderingContext2D, rect: RoundedRectradiusTRBLCorn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoundedRectPath")(ctx.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def alignPixel(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], pixel: Double, width: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_alignPixel")(chart.asInstanceOf[js.Any], pixel.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def alignStartEnd(align: start | end | center, start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_alignStartEnd")(align.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def almostEquals(x: Double, y: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def almostWhole(x: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostWhole")(x.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def angleBetween(angle: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def angleBetween(angle: Double, start: Double, end: Double, sameAngleIsFullCircle: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sameAngleIsFullCircle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def angleDiff(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def arrayUnique[T](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_arrayUnique")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](proxy: ResolverProxy[T, R], context: AnyObject): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    proxy: ResolverProxy[T, R],
    context: AnyObject,
    subProxy: Unit,
    descriptorDefaults: DescriptorDefaults
  ): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any], descriptorDefaults.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](proxy: ResolverProxy[T, R], context: AnyObject, subProxy: ResolverProxy[T, R]): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  inline def attachContext[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    proxy: ResolverProxy[T, R],
    context: AnyObject,
    subProxy: ResolverProxy[T, R],
    descriptorDefaults: DescriptorDefaults
  ): ContextProxy[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_attachContext")(proxy.asInstanceOf[js.Any], context.asInstanceOf[js.Any], subProxy.asInstanceOf[js.Any], descriptorDefaults.asInstanceOf[js.Any])).asInstanceOf[ContextProxy[T, R]]
  
  inline def bezierCurveTo(ctx: CanvasRenderingContext2D, previous: SplinePoint, target: SplinePoint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierCurveTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bezierCurveTo(ctx: CanvasRenderingContext2D, previous: SplinePoint, target: SplinePoint, flip: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierCurveTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def boundSegment(segment: Loop, points: js.Array[PointElement]): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegment")(segment.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  inline def boundSegment(segment: Loop, points: js.Array[PointElement], bounds: Property): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegment")(segment.asInstanceOf[js.Any], points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  
  inline def boundSegments(line: LineElement): js.Array[Loop] = ^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegments")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[Loop]]
  inline def boundSegments(line: LineElement, bounds: Property): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegments")(line.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  inline def callback[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clearCanvas(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCanvas(canvas: HTMLCanvasElement, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipArea(ctx: CanvasRenderingContext2D, area: TRBL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clipArea")(ctx.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clone_[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def color(value: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: js.Tuple3[Double, Double, Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: js.Tuple4[Double, Double, Double, Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: A): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def color(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def computeSegments(line: LineElement): js.Array[Segment] = ^.asInstanceOf[js.Dynamic].applyDynamic("_computeSegments")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[Segment]]
  inline def computeSegments(line: LineElement, segmentOptions: js.Object): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("_computeSegments")(line.asInstanceOf[js.Any], segmentOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  
  inline def createContext[T /* <: js.Object */](parentContext: Null, context: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createContext[T /* <: js.Object */, P /* <: T */](parentContext: P, context: T): P & T = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[P & T]
  
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: R): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: R,
    fallback: Unit,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: R, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: R,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: Unit,
    fallback: Unit,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: js.Array[String], rootScopes: Unit, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: js.Array[String],
    rootScopes: Unit,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R, fallback: Unit, getTarget: js.Function0[AnyObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: R, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: Unit,
    rootScopes: R,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: Unit, fallback: Unit, getTarget: js.Function0[AnyObject]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](scopes: T, prefixes: Unit, rootScopes: Unit, fallback: ResolverObjectKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def createResolver[T /* <: js.Array[AnyObject] */, R /* <: js.Array[AnyObject] */](
    scopes: T,
    prefixes: Unit,
    rootScopes: Unit,
    fallback: ResolverObjectKey,
    getTarget: js.Function0[AnyObject]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createResolver")(scopes.asInstanceOf[js.Any], prefixes.asInstanceOf[js.Any], rootScopes.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], getTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def debounce[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], delay: Double): js.Function1[/* args */ TArgs, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Double]]
  
  inline def decimalPlaces(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_decimalPlaces")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def deprecated(scope: String, value: Any, previous: String, current: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_deprecated")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def descriptors(proxy: ResolverCache[js.Array[AnyObject], js.Array[AnyObject]]): Descriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("_descriptors")(proxy.asInstanceOf[js.Any]).asInstanceOf[Descriptor]
  inline def descriptors(proxy: ResolverCache[js.Array[AnyObject], js.Array[AnyObject]], defaults: DescriptorDefaults): Descriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("_descriptors")(proxy.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Descriptor]
  
  inline def distanceBetweenPoints(pt1: Point, pt2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceBetweenPoints")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def drawPoint(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPointLegend(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double, w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPointLegend")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def each[T, TA](loopable: js.Array[T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: js.Array[T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](loopable: Record[String, T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: TA
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: TA,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T, TA](
    loopable: Record[String, T],
    fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
    thisArg: Unit,
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object easingEffects {
    
    @JSImport("chart.js/dist/helpers", "easingEffects")
    @js.native
    val ^ : js.Any = js.native
    
    inline def easeInBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInOutSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeInSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutBack(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBack")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutBounce(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBounce")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutCirc(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCirc")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutCubic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCubic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutElastic(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutElastic")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutExpo(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutExpo")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutQuad(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuad")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutQuart(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuart")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutQuint(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeOutSine(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutSine")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def linear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def elementsEqual(a0: js.Array[ActiveDataPoint], a1: js.Array[ActiveDataPoint]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_elementsEqual")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def factorize(value: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("_factorize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def filterBetween(values: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_filterBetween")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def finiteOrDefault(value: Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("finiteOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fontString(pixelSize: Double, fontStyle: String, fontFamily: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fontString")(pixelSize.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], fontFamily.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumber(num: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(num: Double, locale: String, options: NumberFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAngleFromPoint(centrePoint: Point, anglePoint: Point): Distance = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleFromPoint")(centrePoint.asInstanceOf[js.Any], anglePoint.asInstanceOf[js.Any])).asInstanceOf[Distance]
  
  inline def getHoverColor(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoverColor(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def getHoverColor(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def getMaximumSize(canvas: HTMLCanvasElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Double, bbHeight: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Double, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getMaximumSize(canvas: HTMLCanvasElement, bbWidth: Unit, bbHeight: Unit, aspectRatio: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumSize")(canvas.asInstanceOf[js.Any], bbWidth.asInstanceOf[js.Any], bbHeight.asInstanceOf[js.Any], aspectRatio.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getParentNode(domNode: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("_getParentNode")(domNode.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  inline def getRelativePosition(event: ChartEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: Event, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: MouseEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: TouchEvent, chart: default): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getRtlAdapter(rtl: Boolean, rectX: Double, width: Double): RTLAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("getRtlAdapter")(rtl.asInstanceOf[js.Any], rectX.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RTLAdapter]
  
  inline def getStartAndCountOfVisiblePoints(
    meta: ChartMeta[
      line | scatter, 
      typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject], 
      typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject]
    ],
    points: js.Array[typings.chartJs.distTypesIndexMod.PointElement],
    animationsDisabled: Boolean
  ): Count = (^.asInstanceOf[js.Dynamic].applyDynamic("_getStartAndCountOfVisiblePoints")(meta.asInstanceOf[js.Any], points.asInstanceOf[js.Any], animationsDisabled.asInstanceOf[js.Any])).asInstanceOf[Count]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def int16Range(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_int16Range")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBetween(value: Double, start: Double, end: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isClickEvent(e: ChartEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isClickEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDomSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDomSupported")().asInstanceOf[Boolean]
  
  /**
    * Returns true if `value` is a finite number, else returns false
    * @param value  - The value to test.
    */
  inline def isFinite(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndef(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndef")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(n: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(value: Any): /* is chart.js.chart.js/dist/types/basic.AnyObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chart.js.chart.js/dist/types/basic.AnyObject */ Boolean]
  
  inline def isPatternOrGradient(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPointInArea(point: Point, area: TRBL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isPointInArea")(point.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInArea(point: Point, area: TRBL, margin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isPointInArea")(point.asInstanceOf[js.Any], area.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def limitValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_limitValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def listenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def longestText(ctx: CanvasRenderingContext2D, font: String, arrayOfThings: Things): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_longestText")(ctx.asInstanceOf[js.Any], font.asInstanceOf[js.Any], arrayOfThings.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def longestText(ctx: CanvasRenderingContext2D, font: String, arrayOfThings: Things, cache: Data): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_longestText")(ctx.asInstanceOf[js.Any], font.asInstanceOf[js.Any], arrayOfThings.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lookup(table: js.Array[Double], value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookup(table: js.Array[Double], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double, last: Boolean): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def lookup_T[T](table: js.Array[T], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def measureText(
    ctx: CanvasRenderingContext2D,
    data: Record[String, Double],
    gc: js.Array[String],
    longest: Double,
    string: String
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_measureText")(ctx.asInstanceOf[js.Any], data.asInstanceOf[js.Any], gc.asInstanceOf[js.Any], longest.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def merge[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T](target: T, source: js.Array[AnyObject], options: MergeOptions): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def merge[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1](target: T, source: S1, options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2](target: T, source: js.Tuple2[S1, S2], options: MergeOptions): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3], options: MergeOptions): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  inline def merge[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4], options: MergeOptions): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
  inline def mergeIf[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def mergeIf[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
  inline def mergeIf[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
  inline def mergeIf[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
  
  inline def mergeIf_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def mergeIf_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  inline def merge_TS1_Intersection[T, S1](target: T, source: js.Array[S1], options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
  
  inline def merge_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def merge_T_T[T](target: T, source: js.Array[Any], options: MergeOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merger(key: String, target: AnyObject, source: AnyObject, options: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_merger")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergerIf(key: String, target: AnyObject, source: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_mergerIf")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def niceNum(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("niceNum")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def normalizeAngle(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalizeAngle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def overrideTextDirection(ctx: CanvasRenderingContext2D, direction: ltr | rtl): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTextDirection")(ctx.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseObjectDataRadialScale(
    meta: ChartMeta[
      line | scatter, 
      typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject], 
      typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject]
    ],
    data: js.Array[AnyObject],
    start: Double,
    count: Double
  ): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("_parseObjectDataRadialScale")(meta.asInstanceOf[js.Any], data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  inline def pointInLine(p1: Point, p2: Point, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def pointInLine(p1: Point, p2: Point, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def readUsedSize(element: HTMLElement, property: width | height): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def readValueToProps[K /* <: String */](value: Double, props: js.Array[K]): Record[K, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[K, Double]]
  inline def readValueToProps[K /* <: String */](value: Record[K, Double], props: js.Array[K]): Record[K, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[K, Double]]
  inline def readValueToProps[K /* <: String */, T /* <: String */](value: Double, props: Record[T, K]): Record[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[T, Double]]
  inline def readValueToProps[K /* <: String */, T /* <: String */](value: Record[K & T, Double], props: Record[T, K]): Record[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_readValueToProps")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Record[T, Double]]
  
  inline def renderText(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, font: CanvasFontSpec): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    font: CanvasFontSpec,
    opts: RenderTextOpts
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(ctx: CanvasRenderingContext2D, text: js.Array[String], x: Double, y: Double, font: CanvasFontSpec): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderText(
    ctx: CanvasRenderingContext2D,
    text: js.Array[String],
    x: Double,
    y: Double,
    font: CanvasFontSpec,
    opts: RenderTextOpts
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], font.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chart.js/dist/helpers", "requestAnimFrame")
  @js.native
  val requestAnimFrame: js.Function1[(/* callback */ Any) | (/* callback */ FrameRequestCallback), Any | Double] = js.native
  
  inline def resolve(inputs: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def resolveObjectKey(obj: AnyObject, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveObjectKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D, original: js.Tuple2[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def retinaScale(chart: default, forceRatio: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def retinaScale(chart: default, forceRatio: Double, forceStyle: Boolean): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  inline def rlookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_rlookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def scaleRangesChanged(meta: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scaleRangesChanged")(meta.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setMinAndMaxByKey(array: js.Array[Record[String, Double]], target: Max, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setMinAndMaxByKey")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setsEqual[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splineCurve(firstPoint: SplinePoint, middlePoint: SplinePoint, afterPoint: SplinePoint, t: Double): Next = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurve")(firstPoint.asInstanceOf[js.Any], middlePoint.asInstanceOf[js.Any], afterPoint.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Next]
  
  inline def splineCurveMonotone(points: js.Array[SplinePoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def splineCurveMonotone(points: js.Array[SplinePoint], indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def splitKey(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_splitKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def steppedInterpolation(p1: Point, p2: Point, t: Double, mode: middle | after): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def steppedInterpolation(p1: Point, p2: Point, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Boolean, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Unit, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chart.js/dist/helpers", "supportsEventListenerOptions")
  @js.native
  val supportsEventListenerOptions: Boolean = js.native
  
  inline def textX(align: left | right | center, left: Double, right: Double, rtl: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_textX")(align.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def throttled[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], thisArg: Any): js.Function1[/* args */ TArgs, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Unit]]
  
  inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toDimension(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toDimension(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDimension")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toFont(options: PartialFontSpec): LineHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any]).asInstanceOf[LineHeight]
  inline def toFont(options: PartialFontSpec, fallback: PartialFontSpec): LineHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[LineHeight]
  
  inline def toFontString(font: FontSpec): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(font.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLeftRightCenter(align: start | end | center): center | left | right = ^.asInstanceOf[js.Dynamic].applyDynamic("_toLeftRightCenter")(align.asInstanceOf[js.Any]).asInstanceOf[center | left | right]
  
  inline def toLineHeight(value: String, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toLineHeight(value: Double, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toPadding(): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")().asInstanceOf[ChartArea]
  inline def toPadding(value: Double): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  inline def toPadding(value: TRBL): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  
  inline def toPercentage(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def toPercentage(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toTRBL(value: Double): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  inline def toTRBL(value: Point): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  inline def toTRBL(value: TRBL): Recordlefttopbottomrightn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordlefttopbottomrightn]
  
  inline def toTRBLCorners(value: Double): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
  inline def toTRBLCorners(value: TRBLCorners): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  inline def unclipArea(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unclipArea")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unlistenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlistenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateBezierControlPoints(points: js.Array[SplinePoint], options: Any, area: ChartArea, loop: Boolean, indexAxis: x | y): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updateBezierControlPoints")(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any], area.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def valueOrDefault[T](value: T, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def valueOrDefault[T](value: Unit, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("valueOrDefault")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
}
