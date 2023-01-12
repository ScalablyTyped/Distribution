package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDisabled extends StObject {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
}
object ActiveDisabled {
  
  inline def apply(): ActiveDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveDisabled] (val x: Self) extends AnyVal {
    
    inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    inline def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
  }
}
