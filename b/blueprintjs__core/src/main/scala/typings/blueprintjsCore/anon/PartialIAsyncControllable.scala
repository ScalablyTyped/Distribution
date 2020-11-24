package typings.blueprintjsCore.anon

import typings.blueprintjsCore.asyncControllableInputMod.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/forms/asyncControllableInput.IAsyncControllableInputState> */
@js.native
trait PartialIAsyncControllable extends js.Object {
  
  var hasPendingUpdate: js.UndefOr[Boolean] = js.native
  
  var isComposing: js.UndefOr[Boolean] = js.native
  
  var nextValue: js.UndefOr[InputValue] = js.native
  
  var value: js.UndefOr[InputValue] = js.native
}
object PartialIAsyncControllable {
  
  @scala.inline
  def apply(): PartialIAsyncControllable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIAsyncControllable]
  }
  
  @scala.inline
  implicit class PartialIAsyncControllableOps[Self <: PartialIAsyncControllable] (val x: Self) extends AnyVal {
    
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
    def deleteHasPendingUpdate: Self = this.set("hasPendingUpdate", js.undefined)
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsComposing: Self = this.set("isComposing", js.undefined)
    
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
