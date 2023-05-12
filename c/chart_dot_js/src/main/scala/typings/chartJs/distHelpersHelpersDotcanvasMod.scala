package typings.chartJs

import typings.chartJs.anon.Data
import typings.chartJs.anon.RoundedRectradiusTRBLCorn
import typings.chartJs.distTypesGeometricMod.Point
import typings.chartJs.distTypesGeometricMod.SplinePoint
import typings.chartJs.distTypesGeometricMod.TRBL
import typings.chartJs.distTypesIndexMod.CanvasFontSpec
import typings.chartJs.distTypesIndexMod.Chart
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.FontSpec
import typings.chartJs.distTypesIndexMod.PointStyle
import typings.chartJs.distTypesIndexMod.RenderTextOpts
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotcanvasMod {
  
  @JSImport("chart.js/dist/helpers/helpers.canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRoundedRectPath(ctx: CanvasRenderingContext2D, rect: RoundedRectradiusTRBLCorn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoundedRectPath")(ctx.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def alignPixel(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], pixel: Double, width: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_alignPixel")(chart.asInstanceOf[js.Any], pixel.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bezierCurveTo(ctx: CanvasRenderingContext2D, previous: SplinePoint, target: SplinePoint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierCurveTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bezierCurveTo(ctx: CanvasRenderingContext2D, previous: SplinePoint, target: SplinePoint, flip: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_bezierCurveTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearCanvas(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCanvas(canvas: HTMLCanvasElement, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipArea(ctx: CanvasRenderingContext2D, area: TRBL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clipArea")(ctx.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPoint(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPointLegend(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double, w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPointLegend")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isPointInArea(point: Point, area: TRBL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isPointInArea")(point.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointInArea(point: Point, area: TRBL, margin: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isPointInArea")(point.asInstanceOf[js.Any], area.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def longestText(ctx: CanvasRenderingContext2D, font: String, arrayOfThings: Things): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_longestText")(ctx.asInstanceOf[js.Any], font.asInstanceOf[js.Any], arrayOfThings.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def longestText(ctx: CanvasRenderingContext2D, font: String, arrayOfThings: Things, cache: Data): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_longestText")(ctx.asInstanceOf[js.Any], font.asInstanceOf[js.Any], arrayOfThings.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def measureText(
    ctx: CanvasRenderingContext2D,
    data: Record[String, Double],
    gc: js.Array[String],
    longest: Double,
    string: String
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_measureText")(ctx.asInstanceOf[js.Any], data.asInstanceOf[js.Any], gc.asInstanceOf[js.Any], longest.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Boolean, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def steppedLineTo(ctx: CanvasRenderingContext2D, previous: Point, target: Point, flip: Unit, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_steppedLineTo")(ctx.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], target.asInstanceOf[js.Any], flip.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toFontString(font: FontSpec): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(font.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unclipArea(ctx: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unclipArea")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawPointOptions] (val x: Self) extends AnyVal {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setPointStyle(value: PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  type Thing = js.UndefOr[String | Null]
  
  type Things = js.Array[Thing | js.Array[Thing]]
}
