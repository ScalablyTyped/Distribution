package typings.chartJs

import typings.chartJs.anon.Family
import typings.chartJs.mod.PointStyle
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesGeometricMod.ChartArea
import typings.chartJs.typesGeometricMod.RoundedRect
import typings.chartJs.typesHelpersHelpersDotoptionsMod.CanvasFontSpec
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotcanvasMod {
  
  @JSImport("chart.js/types/helpers/helpers.canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRoundedRectPath(ctx: CanvasRenderingContext2D, rect: RoundedRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoundedRectPath")(ctx.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearCanvas(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCanvas(canvas: HTMLCanvasElement, ctx: CanvasRenderingContext2D): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearCanvas")(canvas.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clipArea(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clipArea")(ctx.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPoint(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawPointLegend(ctx: CanvasRenderingContext2D, options: DrawPointOptions, x: Double, y: Double, w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPointLegend")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def toFontString(font: Family): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toFontString")(font.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderTextOpts] (val x: Self) extends AnyVal {
      
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
}
