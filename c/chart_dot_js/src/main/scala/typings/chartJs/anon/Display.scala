package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.FontSpec
import typings.chartJs.distTypesIndexMod.ScriptableAndScriptableOptions
import typings.chartJs.distTypesIndexMod.ScriptableCartesianScaleContext
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  /** Alignment of the axis title. */
  var align: typings.chartJs.distTypesIndexMod.Align
  
  /** Color of the axis label. */
  var color: typings.chartJs.distTypesColorMod.Color
  
  /** If true, displays the axis title. */
  var display: Boolean
  
  /** Information about the axis title font. */
  var font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext]
  
  /** Padding to apply around scale labels. */
  var padding: Double | TopY
  
  /** The text for the title, e.g. "# of People" or "Response Choices". */
  var text: String | js.Array[String]
}
object Display {
  
  inline def apply(
    align: typings.chartJs.distTypesIndexMod.Align,
    color: typings.chartJs.distTypesColorMod.Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext],
    padding: Double | TopY,
    text: String | js.Array[String]
  ): Display = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: typings.chartJs.distTypesIndexMod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.chartJs.distTypesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[Partial[FontSpec], ScriptableCartesianScaleContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableCartesianScaleContext, /* options */ AnyObject) => js.UndefOr[Partial[FontSpec]]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double | TopY): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
