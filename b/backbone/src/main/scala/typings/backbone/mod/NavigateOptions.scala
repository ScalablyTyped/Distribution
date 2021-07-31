package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateOptions extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var trigger: js.UndefOr[Boolean] = js.undefined
}
object NavigateOptions {
  
  @scala.inline
  def apply(): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions]
  }
  
  @scala.inline
  implicit class NavigateOptionsMutableBuilder[Self <: NavigateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setTrigger(value: Boolean): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
