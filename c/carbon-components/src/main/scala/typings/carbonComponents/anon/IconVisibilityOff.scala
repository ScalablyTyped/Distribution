package typings.carbonComponents.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconVisibilityOff extends StObject {
  
  var iconVisibilityOff: HTMLElement
  
  var iconVisibilityOn: HTMLElement
  
  var passwordIsVisible: Boolean
  
  var selectorPasswordVisibilityTooltip: HTMLElement
}
object IconVisibilityOff {
  
  inline def apply(
    iconVisibilityOff: HTMLElement,
    iconVisibilityOn: HTMLElement,
    passwordIsVisible: Boolean,
    selectorPasswordVisibilityTooltip: HTMLElement
  ): IconVisibilityOff = {
    val __obj = js.Dynamic.literal(iconVisibilityOff = iconVisibilityOff.asInstanceOf[js.Any], iconVisibilityOn = iconVisibilityOn.asInstanceOf[js.Any], passwordIsVisible = passwordIsVisible.asInstanceOf[js.Any], selectorPasswordVisibilityTooltip = selectorPasswordVisibilityTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconVisibilityOff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconVisibilityOff] (val x: Self) extends AnyVal {
    
    inline def setIconVisibilityOff(value: HTMLElement): Self = StObject.set(x, "iconVisibilityOff", value.asInstanceOf[js.Any])
    
    inline def setIconVisibilityOn(value: HTMLElement): Self = StObject.set(x, "iconVisibilityOn", value.asInstanceOf[js.Any])
    
    inline def setPasswordIsVisible(value: Boolean): Self = StObject.set(x, "passwordIsVisible", value.asInstanceOf[js.Any])
    
    inline def setSelectorPasswordVisibilityTooltip(value: HTMLElement): Self = StObject.set(x, "selectorPasswordVisibilityTooltip", value.asInstanceOf[js.Any])
  }
}
