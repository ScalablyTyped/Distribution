package typings.chartJs.anon

import typings.chartJs.mod.ScriptableAndScriptableOptions
import typings.chartJs.mod.ScriptableCartesianScaleContext
import typings.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  /** Alignment of the axis title. */
  var align: typings.chartJs.mod.Align
  
  /** Color of the axis label. */
  var color: typings.chartJs.typesColorMod.Color
  
  /** If true, displays the axis title. */
  var display: Boolean
  
  /** Information about the axis title font. */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableCartesianScaleContext]
  
  /** Padding to apply around scale labels. */
  var padding: Double | Top
  
  /** The text for the title, e.g. "# of People" or "Response Choices". */
  var text: String | js.Array[String]
}
object Align {
  
  inline def apply(
    align: typings.chartJs.mod.Align,
    color: typings.chartJs.typesColorMod.Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableCartesianScaleContext],
    padding: Double | Top,
    text: String | js.Array[String]
  ): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: typings.chartJs.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.chartJs.typesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableCartesianScaleContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableCartesianScaleContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double | Top): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
