package typings.bootstrapFilestyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilestyleOptions extends StObject {
  
  var badge: js.UndefOr[Boolean] = js.undefined
  
  var buttonBefore: js.UndefOr[Boolean] = js.undefined
  
  var buttonName: js.UndefOr[String] = js.undefined
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Boolean] = js.undefined
  
  var iconName: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object FilestyleOptions {
  
  inline def apply(): FilestyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilestyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilestyleOptions] (val x: Self) extends AnyVal {
    
    inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setButtonBefore(value: Boolean): Self = StObject.set(x, "buttonBefore", value.asInstanceOf[js.Any])
    
    inline def setButtonBeforeUndefined: Self = StObject.set(x, "buttonBefore", js.undefined)
    
    inline def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    inline def setButtonNameUndefined: Self = StObject.set(x, "buttonName", js.undefined)
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    inline def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
