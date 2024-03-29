package typings.chartJs.anon

import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.start
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesIndexMod.ScriptableAndScriptableOptions
import typings.chartJs.distTypesIndexMod.ScriptableChartContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * Color of title
    * @see Defaults.color
    */
  var color: typings.chartJs.distTypesColorMod.Color
  
  /**
    * Is the legend title displayed.
    * @default false
    */
  var display: Boolean
  
  /**
    * see Fonts
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]
  
  var padding: js.UndefOr[Double | ChartArea] = js.undefined
  
  var position: center | start | end
  
  /**
    * The string title.
    */
  var text: String
}
object Color {
  
  inline def apply(
    color: typings.chartJs.distTypesColorMod.Color,
    display: Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext],
    position: center | start | end,
    text: String
  ): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(value: typings.chartJs.distTypesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableChartContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Double | ChartArea): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: center | start | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
