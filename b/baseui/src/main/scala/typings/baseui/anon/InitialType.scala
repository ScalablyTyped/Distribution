package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialType extends StObject {
  
  var initialType: String
  
  var isFocusVisibleForClear: Boolean
  
  var isFocusVisibleForMaskToggle: Boolean
  
  var isFocused: Boolean
  
  var isMasked: Boolean
}
object InitialType {
  
  inline def apply(
    initialType: String,
    isFocusVisibleForClear: Boolean,
    isFocusVisibleForMaskToggle: Boolean,
    isFocused: Boolean,
    isMasked: Boolean
  ): InitialType = {
    val __obj = js.Dynamic.literal(initialType = initialType.asInstanceOf[js.Any], isFocusVisibleForClear = isFocusVisibleForClear.asInstanceOf[js.Any], isFocusVisibleForMaskToggle = isFocusVisibleForMaskToggle.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMasked = isMasked.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialType] (val x: Self) extends AnyVal {
    
    inline def setInitialType(value: String): Self = StObject.set(x, "initialType", value.asInstanceOf[js.Any])
    
    inline def setIsFocusVisibleForClear(value: Boolean): Self = StObject.set(x, "isFocusVisibleForClear", value.asInstanceOf[js.Any])
    
    inline def setIsFocusVisibleForMaskToggle(value: Boolean): Self = StObject.set(x, "isFocusVisibleForMaskToggle", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsMasked(value: Boolean): Self = StObject.set(x, "isMasked", value.asInstanceOf[js.Any])
  }
}
