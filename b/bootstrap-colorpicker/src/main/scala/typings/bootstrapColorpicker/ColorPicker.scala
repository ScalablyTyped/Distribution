package typings.bootstrapColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPicker extends StObject {
  
  var color: Color
  
  var component: Boolean
  
  var container: Boolean
  
  var disabled: Boolean
  
  var element: JQuery
  
  var format: String
  
  var input: JQuery
  
  var options: ColorPickerOptions
  
  var picker: JQuery
}
object ColorPicker {
  
  inline def apply(
    color: Color,
    component: Boolean,
    container: Boolean,
    disabled: Boolean,
    element: JQuery,
    format: String,
    input: JQuery,
    options: ColorPickerOptions,
    picker: JQuery
  ): ColorPicker = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPicker]
  }
  
  extension [Self <: ColorPicker](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: Boolean): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setInput(value: JQuery): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ColorPickerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPicker(value: JQuery): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
  }
}
