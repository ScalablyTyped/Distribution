package typings.baseui.selectTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectState extends StObject {
  
  var activeDescendant: js.UndefOr[String | Null] = js.undefined
  
  var inputValue: String
  
  var isFocused: Boolean
  
  var isOpen: Boolean
  
  var isPseudoFocused: Boolean
}
object SelectState {
  
  inline def apply(inputValue: String, isFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectState] (val x: Self) extends AnyVal {
    
    inline def setActiveDescendant(value: String): Self = StObject.set(x, "activeDescendant", value.asInstanceOf[js.Any])
    
    inline def setActiveDescendantNull: Self = StObject.set(x, "activeDescendant", null)
    
    inline def setActiveDescendantUndefined: Self = StObject.set(x, "activeDescendant", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
  }
}
