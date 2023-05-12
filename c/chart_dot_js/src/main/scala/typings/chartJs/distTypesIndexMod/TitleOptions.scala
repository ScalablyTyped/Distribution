package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.BottomTop
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.top
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOptions extends StObject {
  
  /**
    * Alignment of the title.
    * @default 'center'
    */
  var align: Align
  
  /**
    * Color of text
    * @see Defaults.color
    */
  var color: Color
  
  /**
    * Is the title shown?
    * @default false
    */
  var display: Boolean
  
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]
  
  /**
    * Marks that this box should take the full width/height of the canvas (moving other boxes). If set to `false`, places the box above/beside the
    * chart area
    * @default true
    */
  var fullSize: Boolean
  
  /**
    *   Adds padding above and below the title text if a single number is specified. It is also possible to change top and bottom padding separately.
    */
  var padding: Double | BottomTop
  
  /**
    * Position of title
    * @default 'top'
    */
  var position: top | left | bottom | right
  
  /**
    *   Title text to display. If specified as an array, text is rendered on multiple lines.
    */
  var text: String | js.Array[String]
}
object TitleOptions {
  
  inline def apply(
    align: Align,
    color: Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext],
    fullSize: Boolean,
    padding: Double | BottomTop,
    position: top | left | bottom | right,
    text: String | js.Array[String]
  ): TitleOptions = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fullSize = fullSize.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableChartContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double | BottomTop): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: top | left | bottom | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
