package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateOptions extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var trigger: js.UndefOr[Boolean] = js.undefined
}
object NavigateOptions {
  
  inline def apply(): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions]
  }
  
  extension [Self <: NavigateOptions](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setTrigger(value: Boolean): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
