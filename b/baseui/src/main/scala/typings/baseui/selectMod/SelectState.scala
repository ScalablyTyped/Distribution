package typings.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectState extends js.Object {
  
  var activeDescendant: String | Null = js.native
  
  var inputValue: String = js.native
  
  var isFocused: Boolean = js.native
  
  var isOpen: Boolean = js.native
  
  var isPseudoFocused: Boolean = js.native
}
object SelectState {
  
  @scala.inline
  def apply(inputValue: String, isFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectState]
  }
  
  @scala.inline
  implicit class SelectStateOps[Self <: SelectState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoFocused(value: Boolean): Self = this.set("isPseudoFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDescendant(value: String): Self = this.set("activeDescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDescendantNull: Self = this.set("activeDescendant", null)
  }
}
