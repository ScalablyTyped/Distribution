package typings.blueprintjsCore.asyncControllableInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncControllableInputState extends js.Object {
  
  /**
    * Whether there is a pending update we are expecting from a parent component.
    * @default false
    */
  var hasPendingUpdate: Boolean = js.native
  
  /**
    * Whether we are in the middle of a composition event.
    * @default false
    */
  var isComposing: Boolean = js.native
  
  /**
    * The latest input value, which updates during IME composition. Defaults to props.value.
    */
  var nextValue: InputValue = js.native
  
  /**
    * The source of truth for the input value. This is not updated during IME composition.
    * It may be updated by a parent component.
    * @default ""
    */
  var value: InputValue = js.native
}
object IAsyncControllableInputState {
  
  @scala.inline
  def apply(hasPendingUpdate: Boolean, isComposing: Boolean): IAsyncControllableInputState = {
    val __obj = js.Dynamic.literal(hasPendingUpdate = hasPendingUpdate.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncControllableInputState]
  }
  
  @scala.inline
  implicit class IAsyncControllableInputStateOps[Self <: IAsyncControllableInputState] (val x: Self) extends AnyVal {
    
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
    def setHasPendingUpdate(value: Boolean): Self = this.set("hasPendingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextValueVarargs(value: String*): Self = this.set("nextValue", js.Array(value :_*))
    
    @scala.inline
    def setNextValue(value: InputValue): Self = this.set("nextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextValue: Self = this.set("nextValue", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: InputValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
