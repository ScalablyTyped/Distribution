package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTextOpts extends StObject {
  
  /**
    * Dimensions for drawing the label backdrop
    */
  var backdrop: js.UndefOr[BackdropOptions] = js.undefined
  
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
  var textAlign: js.UndefOr[CanvasTextAlign] = js.undefined
  
  /**
    * The text baseline to use. If unset, the existing
    * textBaseline property of the context is unchanged
    */
  var textBaseline: js.UndefOr[CanvasTextBaseline] = js.undefined
  
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
  
  inline def apply(): RenderTextOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTextOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderTextOpts] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: BackdropOptions): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
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
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    inline def setTranslation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
