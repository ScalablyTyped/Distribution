package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait PartialITagInputState extends js.Object {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  var isInputFocused: js.UndefOr[Boolean] = js.native
  
  var prevInputValueProp: js.UndefOr[String] = js.native
}
object PartialITagInputState {
  
  @scala.inline
  def apply(): PartialITagInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITagInputState]
  }
  
  @scala.inline
  implicit class PartialITagInputStateOps[Self <: PartialITagInputState] (val x: Self) extends AnyVal {
    
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
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setIsInputFocused(value: Boolean): Self = this.set("isInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInputFocused: Self = this.set("isInputFocused", js.undefined)
    
    @scala.inline
    def setPrevInputValueProp(value: String): Self = this.set("prevInputValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevInputValueProp: Self = this.set("prevInputValueProp", js.undefined)
  }
}
