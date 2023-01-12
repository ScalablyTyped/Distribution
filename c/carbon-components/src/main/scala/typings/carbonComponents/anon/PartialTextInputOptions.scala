package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/text-input/text-input.TextInputOptions> */
trait PartialTextInputOptions extends StObject {
  
  var passwordIsVisible: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorPasswordField: js.UndefOr[String] = js.undefined
  
  var selectorPasswordVisibilityButton: js.UndefOr[String] = js.undefined
  
  var selectorPasswordVisibilityTooltip: js.UndefOr[String] = js.undefined
  
  var svgIconVisibilityOff: js.UndefOr[String] = js.undefined
  
  var svgIconVisibilityOn: js.UndefOr[String] = js.undefined
}
object PartialTextInputOptions {
  
  inline def apply(): PartialTextInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTextInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTextInputOptions] (val x: Self) extends AnyVal {
    
    inline def setPasswordIsVisible(value: String): Self = StObject.set(x, "passwordIsVisible", value.asInstanceOf[js.Any])
    
    inline def setPasswordIsVisibleUndefined: Self = StObject.set(x, "passwordIsVisible", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorPasswordField(value: String): Self = StObject.set(x, "selectorPasswordField", value.asInstanceOf[js.Any])
    
    inline def setSelectorPasswordFieldUndefined: Self = StObject.set(x, "selectorPasswordField", js.undefined)
    
    inline def setSelectorPasswordVisibilityButton(value: String): Self = StObject.set(x, "selectorPasswordVisibilityButton", value.asInstanceOf[js.Any])
    
    inline def setSelectorPasswordVisibilityButtonUndefined: Self = StObject.set(x, "selectorPasswordVisibilityButton", js.undefined)
    
    inline def setSelectorPasswordVisibilityTooltip(value: String): Self = StObject.set(x, "selectorPasswordVisibilityTooltip", value.asInstanceOf[js.Any])
    
    inline def setSelectorPasswordVisibilityTooltipUndefined: Self = StObject.set(x, "selectorPasswordVisibilityTooltip", js.undefined)
    
    inline def setSvgIconVisibilityOff(value: String): Self = StObject.set(x, "svgIconVisibilityOff", value.asInstanceOf[js.Any])
    
    inline def setSvgIconVisibilityOffUndefined: Self = StObject.set(x, "svgIconVisibilityOff", js.undefined)
    
    inline def setSvgIconVisibilityOn(value: String): Self = StObject.set(x, "svgIconVisibilityOn", value.asInstanceOf[js.Any])
    
    inline def setSvgIconVisibilityOnUndefined: Self = StObject.set(x, "svgIconVisibilityOn", js.undefined)
  }
}
