package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDescendant extends StObject {
  
  var activeDescendant: Any
  
  var inputValue: String
  
  var isFocused: Boolean
  
  var isOpen: Boolean
  
  var isPseudoFocused: Boolean
}
object ActiveDescendant {
  
  inline def apply(
    activeDescendant: Any,
    inputValue: String,
    isFocused: Boolean,
    isOpen: Boolean,
    isPseudoFocused: Boolean
  ): ActiveDescendant = {
    val __obj = js.Dynamic.literal(activeDescendant = activeDescendant.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDescendant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveDescendant] (val x: Self) extends AnyVal {
    
    inline def setActiveDescendant(value: Any): Self = StObject.set(x, "activeDescendant", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
  }
}
