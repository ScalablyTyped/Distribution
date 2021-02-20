package typings.bootstrapFilestyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilestyleOptions extends StObject {
  
  var badge: js.UndefOr[Boolean] = js.native
  
  var buttonBefore: js.UndefOr[Boolean] = js.native
  
  var buttonName: js.UndefOr[String] = js.native
  
  var buttonText: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Boolean] = js.native
  
  var iconName: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object FilestyleOptions {
  
  @scala.inline
  def apply(): FilestyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilestyleOptions]
  }
  
  @scala.inline
  implicit class FilestyleOptionsMutableBuilder[Self <: FilestyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setButtonBefore(value: Boolean): Self = StObject.set(x, "buttonBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonBeforeUndefined: Self = StObject.set(x, "buttonBefore", js.undefined)
    
    @scala.inline
    def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNameUndefined: Self = StObject.set(x, "buttonName", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
