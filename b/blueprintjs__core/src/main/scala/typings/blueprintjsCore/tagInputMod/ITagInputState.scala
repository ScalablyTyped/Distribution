package typings.blueprintjsCore.tagInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagInputState extends js.Object {
  
  var activeIndex: Double = js.native
  
  var inputValue: String = js.native
  
  var isInputFocused: Boolean = js.native
  
  var prevInputValueProp: js.UndefOr[String] = js.native
}
object ITagInputState {
  
  @scala.inline
  def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagInputState]
  }
  
  @scala.inline
  implicit class ITagInputStateOps[Self <: ITagInputState] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInputFocused(value: Boolean): Self = this.set("isInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInputValueProp(value: String): Self = this.set("prevInputValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevInputValueProp: Self = this.set("prevInputValueProp", js.undefined)
  }
}
