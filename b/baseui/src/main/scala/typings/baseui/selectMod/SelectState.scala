package typings.baseui.selectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectState extends StObject {
  
  var activeDescendant: String | Null
  
  var inputValue: String
  
  var isFocused: Boolean
  
  var isOpen: Boolean
  
  var isPseudoFocused: Boolean
}
object SelectState {
  
  @scala.inline
  def apply(inputValue: String, isFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any], activeDescendant = null)
    __obj.asInstanceOf[SelectState]
  }
  
  @scala.inline
  implicit class SelectStateMutableBuilder[Self <: SelectState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDescendant(value: String): Self = StObject.set(x, "activeDescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDescendantNull: Self = StObject.set(x, "activeDescendant", null)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoFocused(value: Boolean): Self = StObject.set(x, "isPseudoFocused", value.asInstanceOf[js.Any])
  }
}
