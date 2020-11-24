package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait ReadonlyITagInputState extends js.Object {
  
  val activeIndex: Double = js.native
  
  val inputValue: String = js.native
  
  val isInputFocused: Boolean = js.native
  
  val prevInputValueProp: js.UndefOr[String] = js.native
}
object ReadonlyITagInputState {
  
  @scala.inline
  def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ReadonlyITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyITagInputState]
  }
  
  @scala.inline
  implicit class ReadonlyITagInputStateOps[Self <: ReadonlyITagInputState] (val x: Self) extends AnyVal {
    
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
