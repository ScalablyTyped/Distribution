package typings.blueprintjsCore.anon

import typings.blueprintjsCore.asyncControllableInputMod.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/forms/asyncControllableInput.IAsyncControllableInputState> */
trait PartialIAsyncControllable extends StObject {
  
  var hasPendingUpdate: js.UndefOr[Boolean] = js.undefined
  
  var isComposing: js.UndefOr[Boolean] = js.undefined
  
  var nextValue: js.UndefOr[InputValue] = js.undefined
  
  var value: js.UndefOr[InputValue] = js.undefined
}
object PartialIAsyncControllable {
  
  @scala.inline
  def apply(): PartialIAsyncControllable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIAsyncControllable]
  }
  
  @scala.inline
  implicit class PartialIAsyncControllableMutableBuilder[Self <: PartialIAsyncControllable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasPendingUpdate(value: Boolean): Self = StObject.set(x, "hasPendingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingUpdateUndefined: Self = StObject.set(x, "hasPendingUpdate", js.undefined)
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
    
    @scala.inline
    def setNextValue(value: InputValue): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextValueUndefined: Self = StObject.set(x, "nextValue", js.undefined)
    
    @scala.inline
    def setNextValueVarargs(value: String*): Self = StObject.set(x, "nextValue", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: InputValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
