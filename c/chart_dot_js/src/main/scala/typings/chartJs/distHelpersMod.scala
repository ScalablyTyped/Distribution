package typings.chartJs

import typings.chartJs.anon.A
import typings.chartJs.anon.Cacheable
import typings.chartJs.anon.Distance
import typings.chartJs.anon.Height
import typings.chartJs.anon.Hi
import typings.chartJs.anon.LineHeight
import typings.chartJs.anon.Max
import typings.chartJs.anon.Next
import typings.chartJs.anon.PartialaZ
import typings.chartJs.anon.RecordtopLefttopRightbott
import typings.chartJs.anon.Recordtoprightbottomleftn
import typings.chartJs.anon.Start
import typings.chartJs.anon.Style
import typings.chartJs.anon.X
import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.C_
import typings.chartJs.distChunksHelpersDotcoreMod.ChartArea
import typings.chartJs.distChunksHelpersDotcoreMod.ChartEvent1
import typings.chartJs.distChunksHelpersDotcoreMod.ChartMeta
import typings.chartJs.distChunksHelpersDotcoreMod.Color
import typings.chartJs.distChunksHelpersDotcoreMod.Element
import typings.chartJs.distChunksHelpersDotcoreMod.FontSpec
import typings.chartJs.distChunksHelpersDotcoreMod.Point1
import typings.chartJs.distChunksHelpersDotcoreMod.PointStyle
import typings.chartJs.distChunksHelpersDotcoreMod.RoundedRect
import typings.chartJs.distChunksHelpersDotcoreMod.TRBL
import typings.chartJs.distChunksHelpersDotcoreMod.TRBLCorners
import typings.chartJs.distChunksHelpersDotcoreMod.b
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.Event
import typings.std.FrameRequestCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Intl.NumberFormatOptions
import typings.std.MouseEvent
import typings.std.Record
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
  
  /**
    * @alias Chart.helpers.math
    * @namespace
    */
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
  /**
    * @param minmax
    * @param grace
    * @param beginAtZero
    * @private
    */
  inline def addGrace(minmax: Max, grace: Double, beginAtZero: Boolean): Max = (^.asInstanceOf[js.Dynamic].applyDynamic("_addGrace")(minmax.asInstanceOf[js.Any], grace.asInstanceOf[js.Any], beginAtZero.asInstanceOf[js.Any])).asInstanceOf[Max]
  
  inline def addRoundedRectPath(ctx: CanvasRenderingContext2D, rect: RoundedRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoundedRectPath")(ctx.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns `start`, `end` or `(start + end) / 2` depending on `align`. Defaults to `center`
    * @private
    */
  @scala.annotation.targetName("alignStartEnd_start_end_center")
  inline def alignStartEnd(align: "start" | "end" | "center", start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_alignStartEnd")(align.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def almostEquals(x: Double, y: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def almostWhole(x: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostWhole")(x.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @private
    */
  inline def angleBetween(angle: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def angleBetween(angle: Double, start: Double, end: Double, sameAngleIsFullCircle: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sameAngleIsFullCircle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Shortest distance between angles, in either direction.
    * @private
    */
  inline def angleDiff(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * @param items
    */
  inline def arrayUnique[T](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_arrayUnique")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  /**
    * @private
    */
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def bezierInterpolation(p1: SplinePoint, p2: SplinePoint, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def clearCanvas(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCanvas(canvas: HTMLCanvasElement, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipArea(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clipArea")(ctx.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def color(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def color(value: js.Tuple3[Double, Double, Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def color(value: js.Tuple4[Double, Double, Double, Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def color(value: A): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def color(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def color(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  /**
    * Create a context inheriting parentContext
    * @param parentContext
    * @param context
    * @returns
    */
  inline def createContext[P /* <: T */, T /* <: js.Object */](parentContext: P, context: T): /* import warning: importer.ImportType#apply Failed type conversion: P extends null ? T : P & T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(parentContext.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: P extends null ? T : P & T */ js.Any]
  
  /**
    * Debounces calling `fn` for `delay` ms
    */
  inline def debounce[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], delay: Double): js.Function1[/* args */ TArgs, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Double]]
  
  /**
    * Returns the number of decimal places
    * i.e. the number of digits after the decimal point, of the value of this Number.
    * @param x - A number.
    * @returns The number of decimal places.
    * @private
    */
  inline def decimalPlaces(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_decimalPlaces")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def distanceBetweenPoints(pt1: Point1, pt2: Point1): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceBetweenPoints")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def drawPoint(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPointLegend(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double, w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPointLegend")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns an array of factors sorted from 1 to sqrt(value)
    * @private
    */
  inline def factorize(value: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("_factorize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Return subset of `values` between `min` and `max` inclusive.
    * Values are assumed to be in sorted order.
    * @param values - sorted array of values
    * @param min - min value
    * @param max - max value
    */
  inline def filterBetween(values: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("_filterBetween")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def fontString(pixelSize: Double, fontStyle: String, fontFamily: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fontString")(pixelSize.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], fontFamily.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumber(num: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(num: Double, locale: String, options: NumberFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(num.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAngleFromPoint(centrePoint: Point1, anglePoint: Point1): Distance = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleFromPoint")(centrePoint.asInstanceOf[js.Any], anglePoint.asInstanceOf[js.Any])).asInstanceOf[Distance]
  
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
  
  /**
    * @private
    */
  inline def getParentNode(domNode: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("_getParentNode")(domNode.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  inline def getRelativePosition(event: ChartEvent1, chart: C_): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  /**
    * Gets an event's x, y coordinates, relative to the chart area
    * @param event
    * @param chart
    * @returns x and y coordinates of the event
    */
  inline def getRelativePosition(event: Event, chart: C_): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: MouseEvent, chart: C_): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def getRelativePosition(event: TouchEvent, chart: C_): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePosition")(event.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def getRtlAdapter(rtl: Boolean, rectX: Double, width: Double): RTLAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("getRtlAdapter")(rtl.asInstanceOf[js.Any], rectX.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[RTLAdapter]
  
  /**
    * Return start and count of visible points.
    * @private
    */
  @scala.annotation.targetName("getStartAndCountOfVisiblePoints_line_scatter")
  inline def getStartAndCountOfVisiblePoints(
    meta: ChartMeta["line" | "scatter", Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]],
    points: js.Array[b],
    animationsDisabled: Boolean
  ): Start = (^.asInstanceOf[js.Dynamic].applyDynamic("_getStartAndCountOfVisiblePoints")(meta.asInstanceOf[js.Any], points.asInstanceOf[js.Any], animationsDisabled.asInstanceOf[js.Any])).asInstanceOf[Start]
  
  inline def getStyle(el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @param {number} value
    * @private
    */
  inline def int16Range(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_int16Range")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @param value
    * @param start
    * @param end
    * @param [epsilon]
    * @private
    */
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBetween(value: Double, start: Double, end: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Note: typedefs are auto-exported, so use a made-up `dom` namespace where
    * necessary to avoid duplicates with `export * from './helpers`; see
    * https://github.com/microsoft/TypeScript/issues/46011
    * @typedef { import("../core/core.controller").default } dom.Chart
    * @typedef { import('../../types').ChartEvent } ChartEvent
    */
  /**
    * @private
    */
  inline def isDomSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isDomSupported")().asInstanceOf[Boolean]
  
  inline def isNumber(n: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isPatternOrGradient(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Limit `value` between `min` and `max`
    * @param value
    * @param min
    * @param max
    * @private
    */
  inline def limitValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_limitValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Hooks the array methods that add or remove values ('push', pop', 'shift', 'splice',
    * 'unshift') and notify the listener AFTER the array has been altered. Listeners are
    * called on the '_onData*' callbacks (e.g. _onDataPush, etc.) with same arguments.
    */
  inline def listenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Binary search
    * @param table - the table search. must be sorted!
    * @param value - value to find
    * @param cmp
    * @private
    */
  inline def lookup(table: js.Array[Double], value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookup(table: js.Array[Double], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  /**
    * Binary search
    * @param table - the table search. must be sorted!
    * @param key - property name for the value in each entry
    * @param value - value to find
    * @param last - lookup last index
    * @private
    */
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  inline def lookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double, last: Boolean): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  inline def lookup_T[T](table: js.Array[T], value: Double, cmp: js.Function1[/* value */ Double, Boolean]): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_lookup")(table.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  /**
    * Implementation of the nice number algorithm used in determining where axis labels will go
    */
  inline def niceNum(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("niceNum")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Normalize angle to be between 0 and 2*PI
    * @private
    */
  inline def normalizeAngle(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalizeAngle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.annotation.targetName("overrideTextDirection_ltr_rtl")
  inline def overrideTextDirection(ctx: CanvasRenderingContext2D, direction: "ltr" | "rtl"): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideTextDirection")(ctx.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @private
    */
  inline def pointInLine(p1: Point1, p2: Point1, t: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def pointInLine(p1: Point1, p2: Point1, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_pointInLine")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  /**
    * The "used" size is the final value of a dimension property after all calculations have
    * been performed. This method uses the computed style of `element` but returns undefined
    * if the computed style is not expressed in pixels. That can happen in some cases where
    * `element` has a size relative to its parent and this last one is not yet displayed,
    * for example because of `display: none` on a parent node.
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/used_value
    * @returns Size in pixels or undefined if unknown.
    */
  @scala.annotation.targetName("readUsedSize_width_height")
  inline def readUsedSize(element: HTMLElement, property: "width" | "height"): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("readUsedSize")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  /**
    * @param value
    * @param props
    */
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
  
  /**
  * Request animation polyfill
  */
  @JSImport("chart.js/dist/helpers", "requestAnimFrame")
  @js.native
  val requestAnimFrame: js.Function1[(/* callback */ Any) | (/* callback */ FrameRequestCallback), Any | Double] = js.native
  
  /**
    * Evaluates the given `inputs` sequentially and returns the first defined value.
    * @param inputs - An array of values, falling back to the last value.
    * @param context - If defined and the current value is a function, the value
    * is called with `context` as first argument and the result becomes the new input.
    * @param index - If defined and the current value is an array, the value
    * at `index` become the new input.
    * @param info - object to return information about resolution in
    * @param info.cacheable - Will be set to `false` if option is not cacheable.
    * @since 2.7.0
    */
  inline def resolve(inputs: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: js.Object, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Double, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolve(inputs: js.Array[Any], context: Unit, index: Unit, info: Cacheable): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(inputs.asInstanceOf[js.Any], context.asInstanceOf[js.Any], index.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restoreTextDirection(ctx: CanvasRenderingContext2D, original: js.Tuple2[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreTextDirection")(ctx.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @param chart
    * @param forceRatio
    * @param forceStyle
    * @returns True if the canvas context size or transformation has changed.
    */
  inline def retinaScale(chart: C_, forceRatio: Double): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  inline def retinaScale(chart: C_, forceRatio: Double, forceStyle: Boolean): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retinaScale")(chart.asInstanceOf[js.Any], forceRatio.asInstanceOf[js.Any], forceStyle.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  /**
    * Reverse binary search
    * @param table - the table search. must be sorted!
    * @param key - property name for the value in each entry
    * @param value - value to find
    * @private
    */
  inline def rlookupByKey(table: js.Array[Record[String, Double]], key: String, value: Double): Hi = (^.asInstanceOf[js.Dynamic].applyDynamic("_rlookupByKey")(table.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Hi]
  
  /**
    * Checks if the scale ranges have changed.
    * @param {object} meta - dataset meta.
    * @returns {boolean}
    * @private
    */
  inline def scaleRangesChanged(meta: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_scaleRangesChanged")(meta.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @private
    */
  inline def setMinAndMaxByKey(array: js.Array[Record[String, Double]], target: Max, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setMinAndMaxByKey")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splineCurve(firstPoint: SplinePoint, middlePoint: SplinePoint, afterPoint: SplinePoint, t: Double): Next = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurve")(firstPoint.asInstanceOf[js.Any], middlePoint.asInstanceOf[js.Any], afterPoint.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Next]
  
  /**
    * This function calculates Bézier control points in a similar way than |splineCurve|,
    * but preserves monotonicity of the provided data and ensures no local extremums are added
    * between the dataset discrete points due to the interpolation.
    * See : https://en.wikipedia.org/wiki/Monotone_cubic_interpolation
    */
  inline def splineCurveMonotone(points: js.Array[SplinePoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.annotation.targetName("splineCurveMonotone_x_y")
  inline def splineCurveMonotone(points: js.Array[SplinePoint], indexAxis: "x" | "y"): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splineCurveMonotone")(points.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.annotation.targetName("steppedInterpolation_middle_after")
  inline def steppedInterpolation(p1: Point1, p2: Point1, t: Double, mode: "middle" | "after"): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  /**
    * @private
    */
  inline def steppedInterpolation(p1: Point1, p2: Point1, t: Double, mode: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedInterpolation")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[X]
  
  /**
    * Detects support for options object argument in addEventListener.
    * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#Safely_detecting_option_support
    * @private
    */
  @JSImport("chart.js/dist/helpers", "supportsEventListenerOptions")
  @js.native
  val supportsEventListenerOptions: Boolean = js.native
  
  /**
    * Returns `left`, `right` or `(left + right) / 2` depending on `align`. Defaults to `left`
    * @private
    */
  @scala.annotation.targetName("textX_left_right_center")
  inline def textX(align: "left" | "right" | "center", left: Double, right: Double, rtl: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_textX")(align.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Throttles calling `fn` once per animation frame
    * Latest arguments are used on the actual call
    */
  inline def throttled[TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, Unit], thisArg: Any): js.Function1[/* args */ TArgs, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttled")(fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, Unit]]
  
  inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Parses font options and returns the font object.
    * @param options - A object that contains font options to be parsed.
    * @param fallback - A object that contains fallback font options.
    * @return The font object.
    * @private
    */
  inline def toFont(options: PartialaZ): LineHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any]).asInstanceOf[LineHeight]
  inline def toFont(options: PartialaZ, fallback: PartialaZ): LineHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("toFont")(options.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[LineHeight]
  
  /**
    * Converts the given font object into a CSS font string.
    * @param font a font object
    * @return The CSS font string. See https://developer.mozilla.org/en-US/docs/Web/CSS/font
    */
  inline def toFontString(font: Style): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(font.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
    * Converts 'start' to 'left', 'end' to 'right' and others to 'center'
    * @private
    */
  @scala.annotation.targetName("toLeftRightCenter_start_end_center")
  inline def toLeftRightCenter(align: "start" | "end" | "center"): "center" | "right" | "left" = ^.asInstanceOf[js.Dynamic].applyDynamic("_toLeftRightCenter")(align.asInstanceOf[js.Any]).asInstanceOf["center" | "right" | "left"]
  
  inline def toLineHeight(value: String, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
    * @alias Chart.helpers.options
    * @namespace
    */
  /**
    * Converts the given line height `value` in pixels for a specific font `size`.
    * @param value - The lineHeight to parse (eg. 1.6, '14px', '75%', '1.6em').
    * @param size - The font size (in pixels) used to resolve relative `value`.
    * @returns The effective line height in pixels (size * 1.2 if value is invalid).
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/line-height
    * @since 2.7.0
    */
  inline def toLineHeight(value: Double, size: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toLineHeight")(value.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Converts the given value into a padding object with pre-computed width/height.
    * @param value - If a number, set the value to all TRBL component,
    *  else, if an object, use defined properties and sets undefined ones to 0.
    *  x / y are shorthands for same value for left/right and top/bottom.
    * @returns The padding values (top, right, bottom, left, width, height)
    * @since 2.7.0
    */
  inline def toPadding(): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")().asInstanceOf[ChartArea]
  inline def toPadding(value: Double): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  inline def toPadding(value: TRBL): ChartArea = ^.asInstanceOf[js.Dynamic].applyDynamic("toPadding")(value.asInstanceOf[js.Any]).asInstanceOf[ChartArea]
  
  inline def toRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Converts the given value into a TRBL object.
    * @param value - If a number, set the value to all TRBL component,
    *  else, if an object, use defined properties and sets undefined ones to 0.
    *  x / y are shorthands for same value for left/right and top/bottom.
    * @returns The padding values (top, right, bottom, left)
    * @since 3.0.0
    */
  inline def toTRBL(value: Double): Recordtoprightbottomleftn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordtoprightbottomleftn]
  inline def toTRBL(value: TRBL): Recordtoprightbottomleftn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordtoprightbottomleftn]
  inline def toTRBL(value: Point): Recordtoprightbottomleftn = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBL")(value.asInstanceOf[js.Any]).asInstanceOf[Recordtoprightbottomleftn]
  
  /**
    * Converts the given value into a TRBL corners object (similar with css border-radius).
    * @param value - If a number, set the value to all TRBL corner components,
    *  else, if an object, use defined properties and sets undefined ones to 0.
    * @returns The TRBL corner values (topLeft, topRight, bottomLeft, bottomRight)
    * @since 3.0.0
    */
  inline def toTRBLCorners(value: Double): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
  inline def toTRBLCorners(value: TRBLCorners): RecordtopLefttopRightbott = ^.asInstanceOf[js.Dynamic].applyDynamic("toTRBLCorners")(value.asInstanceOf[js.Any]).asInstanceOf[RecordtopLefttopRightbott]
  
  inline def unclipArea(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unclipArea")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes the given array event listener and cleanup extra attached properties (such as
    * the _chartjs stub and overridden methods) if array doesn't have any more listeners.
    */
  inline def unlistenArrayEvents[T](array: js.Array[T], listener: ArrayListener[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlistenArrayEvents")(array.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @private
    */
  @scala.annotation.targetName("updateBezierControlPoints_x_y")
  inline def updateBezierControlPoints(points: js.Array[SplinePoint], options: Any, area: ChartArea, loop: Boolean, indexAxis: "x" | "y"): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updateBezierControlPoints")(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any], area.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], indexAxis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ArrayListener[T] extends StObject {
    
    var _onDataPop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var _onDataPush: js.UndefOr[js.Function1[/* repeated */ T, Unit]] = js.undefined
    
    var _onDataShift: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var _onDataSplice: js.UndefOr[
        js.Function3[/* index */ Double, /* deleteCount */ Double, /* repeated */ T, Unit]
      ] = js.undefined
    
    var _onDataUnshift: js.UndefOr[js.Function1[/* repeated */ T, Unit]] = js.undefined
  }
  object ArrayListener {
    
    inline def apply[T](): ArrayListener[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayListener[T]]
    }
    
    extension [Self <: ArrayListener[?], T](x: Self & ArrayListener[T]) {
      
      inline def set_onDataPop(value: () => Unit): Self = StObject.set(x, "_onDataPop", js.Any.fromFunction0(value))
      
      inline def set_onDataPopUndefined: Self = StObject.set(x, "_onDataPop", js.undefined)
      
      inline def set_onDataPush(value: /* repeated */ T => Unit): Self = StObject.set(x, "_onDataPush", js.Any.fromFunction1(value))
      
      inline def set_onDataPushUndefined: Self = StObject.set(x, "_onDataPush", js.undefined)
      
      inline def set_onDataShift(value: () => Unit): Self = StObject.set(x, "_onDataShift", js.Any.fromFunction0(value))
      
      inline def set_onDataShiftUndefined: Self = StObject.set(x, "_onDataShift", js.undefined)
      
      inline def set_onDataSplice(value: (/* index */ Double, /* deleteCount */ Double, /* repeated */ T) => Unit): Self = StObject.set(x, "_onDataSplice", js.Any.fromFunction3(value))
      
      inline def set_onDataSpliceUndefined: Self = StObject.set(x, "_onDataSplice", js.undefined)
      
      inline def set_onDataUnshift(value: /* repeated */ T => Unit): Self = StObject.set(x, "_onDataUnshift", js.Any.fromFunction1(value))
      
      inline def set_onDataUnshiftUndefined: Self = StObject.set(x, "_onDataUnshift", js.undefined)
    }
  }
  
  trait CanvasFontSpec
    extends StObject
       with FontSpec {
    
    var string: String
  }
  object CanvasFontSpec {
    
    inline def apply(
      family: String,
      lineHeight: Double | String,
      size: Double,
      string: String,
      style: "normal" | "italic" | "oblique" | "initial" | "inherit"
    ): CanvasFontSpec = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], weight = null)
      __obj.asInstanceOf[CanvasFontSpec]
    }
    
    extension [Self <: CanvasFontSpec](x: Self) {
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawPointOptions extends StObject {
    
    var borderWidth: Double
    
    var pointStyle: PointStyle
    
    var radius: Double
    
    var rotation: js.UndefOr[Double] = js.undefined
  }
  object DrawPointOptions {
    
    inline def apply(borderWidth: Double, pointStyle: PointStyle, radius: Double): DrawPointOptions = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawPointOptions]
    }
    
    extension [Self <: DrawPointOptions](x: Self) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  /**
    * Note: typedefs are auto-exported, so use a made-up `canvas` namespace where
    * necessary to avoid duplicates with `export * from './helpers`; see
    * https://github.com/microsoft/TypeScript/issues/46011
    */
  type Point = Point1
  
  trait RTLAdapter extends StObject {
    
    def leftForLtr(x: Double, itemWidth: Double): Double
    
    def setWidth(w: Double): Unit
    
    @JSName("textAlign")
    @scala.annotation.targetName("textAlign_center_left_right")
    def textAlign(align: "center" | "left" | "right"): "center" | "left" | "right"
    
    def x(x: Double): Double
    
    def xPlus(x: Double, value: Double): Double
  }
  object RTLAdapter {
    
    inline def apply(
      leftForLtr: (Double, Double) => Double,
      setWidth: Double => Unit,
      textAlign: "center" | "left" | "right" => "center" | "left" | "right",
      x: Double => Double,
      xPlus: (Double, Double) => Double
    ): RTLAdapter = {
      val __obj = js.Dynamic.literal(leftForLtr = js.Any.fromFunction2(leftForLtr), setWidth = js.Any.fromFunction1(setWidth), textAlign = js.Any.fromFunction1(textAlign), x = js.Any.fromFunction1(x), xPlus = js.Any.fromFunction2(xPlus))
      __obj.asInstanceOf[RTLAdapter]
    }
    
    extension [Self <: RTLAdapter](x: Self) {
      
      inline def setLeftForLtr(value: (Double, Double) => Double): Self = StObject.set(x, "leftForLtr", js.Any.fromFunction2(value))
      
      inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setTextAlign(value: "center" | "left" | "right" => "center" | "left" | "right"): Self = StObject.set(x, "textAlign", js.Any.fromFunction1(value))
      
      inline def setX(value: Double => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXPlus(value: (Double, Double) => Double): Self = StObject.set(x, "xPlus", js.Any.fromFunction2(value))
    }
  }
  
  trait RenderTextOpts extends StObject {
    
    /**
      * The fill color of the text. If unset, the existing
      * fillStyle property of the canvas is unchanged.
      */
    var color: js.UndefOr[Color] = js.undefined
    
    /**
      * The width of the strikethrough / underline
      * @default 2
      */
    var decorationWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The max width of the text in pixels
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * A rotation to be applied to the canvas
      * This is applied after the translation is applied
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Apply a strikethrough effect to the text
      */
    var strikethrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The color of the text stroke. If unset, the existing
      * strokeStyle property of the context is unchanged
      */
    var strokeColor: js.UndefOr[Color] = js.undefined
    
    /**
      * The text stroke width. If unset, the existing
      * lineWidth property of the context is unchanged
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The text alignment to use. If unset, the existing
      * textAlign property of the context is unchanged
      */
    var textAlign: CanvasTextAlign
    
    /**
      * The text baseline to use. If unset, the existing
      * textBaseline property of the context is unchanged
      */
    var textBaseline: CanvasTextBaseline
    
    /**
      * If specified, a translation to apply to the context
      */
    var translation: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * Underline the text
      */
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object RenderTextOpts {
    
    inline def apply(textAlign: CanvasTextAlign, textBaseline: CanvasTextBaseline): RenderTextOpts = {
      val __obj = js.Dynamic.literal(textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderTextOpts]
    }
    
    extension [Self <: RenderTextOpts](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDecorationWidth(value: Double): Self = StObject.set(x, "decorationWidth", value.asInstanceOf[js.Any])
      
      inline def setDecorationWidthUndefined: Self = StObject.set(x, "decorationWidth", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
      
      inline def setStrokeColor(value: Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTranslation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
      
      inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait SplinePoint extends StObject {
    
    var cp1x: js.UndefOr[Double] = js.undefined
    
    var cp1y: js.UndefOr[Double] = js.undefined
    
    var cp2x: js.UndefOr[Double] = js.undefined
    
    var cp2y: js.UndefOr[Double] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object SplinePoint {
    
    inline def apply(x: Double, y: Double): SplinePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplinePoint]
    }
    
    extension [Self <: SplinePoint](x: Self) {
      
      inline def setCp1x(value: Double): Self = StObject.set(x, "cp1x", value.asInstanceOf[js.Any])
      
      inline def setCp1xUndefined: Self = StObject.set(x, "cp1x", js.undefined)
      
      inline def setCp1y(value: Double): Self = StObject.set(x, "cp1y", value.asInstanceOf[js.Any])
      
      inline def setCp1yUndefined: Self = StObject.set(x, "cp1y", js.undefined)
      
      inline def setCp2x(value: Double): Self = StObject.set(x, "cp2x", value.asInstanceOf[js.Any])
      
      inline def setCp2xUndefined: Self = StObject.set(x, "cp2x", js.undefined)
      
      inline def setCp2y(value: Double): Self = StObject.set(x, "cp2y", value.asInstanceOf[js.Any])
      
      inline def setCp2yUndefined: Self = StObject.set(x, "cp2y", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
