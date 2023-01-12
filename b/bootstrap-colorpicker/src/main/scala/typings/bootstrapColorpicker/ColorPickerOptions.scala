package typings.bootstrapColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You can set colorpicker options either as a plugin parameter or data-* attributes
  */
trait ColorPickerOptions extends StObject {
  
  /**
    *     By default, the colorpicker is aligned to the right of the input. If you need to switch it to the left, set align to 'left'.
    * 
    * Default: 'right'
    */
  var align: js.UndefOr[ColorPickerAlignOptions] = js.undefined
  
  /**
    * If not false, sets the color to this value.
    * 
    * Default: false
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *     List of pre selected colors (hex format). If you choose one of these colors, the alias is returned instead of the hex code.
    * 
    * Default: null
    */
  var colorSelectors: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Children selector for the component or element that trigger the colorpicker and which background color will change (needs an inner <i> element).
    * 
    * Default: '.add-on, .input-group-addon'
    */
  var component: js.UndefOr[String | JQuery] = js.undefined
  
  /**
    * If not false, the picker will be contained inside this element, otherwise it will be appended to the document body.
    * 
    * Default: false
    */
  var container: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds this class to the colorpicker widget.
    * 
    * Default: null
    */
  var customClass: js.UndefOr[String] = js.undefined
  
  /**
    * Fallback color string that will be applied when the color failed to be parsed. If null, it will keep the current color if any.
    * 
    * Default: null
    */
  var fallbackColor: js.UndefOr[String] = js.undefined
  
  /**
    *     Fallback color format (e.g. when not specified or for alias mode, when selecting non aliased colors)
    * 
    * Default: hex
    */
  var fallbackFormat: js.UndefOr[String] = js.undefined
  
  /**
    * If not false, forces the color format to be hex, rgb or rgba, otherwise the format is automatically detected.
    * 
    * Default: false
    */
  var format: js.UndefOr[ColorFormat] = js.undefined
  
  /**
    * If true, put a '#' (number sign) before hex strings.
    * 
    * Default: true
    */
  var hexNumberSignPrefix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the hue and alpha channel bars will be rendered horizontally, above the saturation selector.
    * 
    * Default: false
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, forces to show the colorpicker as an inline element.
    * 
    * Default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Children selector for the input that will store the picker selected value.
    * 
    * Default: 'input'
    */
  var input: js.UndefOr[String | JQuery] = js.undefined
  
  /**
    * Vertical sliders configuration (read source code if you really need to tweak this).
    */
  var sliders: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Horizontal sliders configuration (read source code if you really need to tweak this).
    */
  var slidersHorz: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Customizes the default colorpicker HTML template.
    */
  var template: js.UndefOr[String] = js.undefined
}
object ColorPickerOptions {
  
  inline def apply(): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: ColorPickerAlignOptions): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorSelectors(value: js.Object): Self = StObject.set(x, "colorSelectors", value.asInstanceOf[js.Any])
    
    inline def setColorSelectorsUndefined: Self = StObject.set(x, "colorSelectors", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponent(value: String | JQuery): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setContainer(value: Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    
    inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
    
    inline def setFallbackColor(value: String): Self = StObject.set(x, "fallbackColor", value.asInstanceOf[js.Any])
    
    inline def setFallbackColorUndefined: Self = StObject.set(x, "fallbackColor", js.undefined)
    
    inline def setFallbackFormat(value: String): Self = StObject.set(x, "fallbackFormat", value.asInstanceOf[js.Any])
    
    inline def setFallbackFormatUndefined: Self = StObject.set(x, "fallbackFormat", js.undefined)
    
    inline def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHexNumberSignPrefix(value: Boolean): Self = StObject.set(x, "hexNumberSignPrefix", value.asInstanceOf[js.Any])
    
    inline def setHexNumberSignPrefixUndefined: Self = StObject.set(x, "hexNumberSignPrefix", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInput(value: String | JQuery): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setSliders(value: js.Object): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    inline def setSlidersHorz(value: js.Object): Self = StObject.set(x, "slidersHorz", value.asInstanceOf[js.Any])
    
    inline def setSlidersHorzUndefined: Self = StObject.set(x, "slidersHorz", js.undefined)
    
    inline def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
