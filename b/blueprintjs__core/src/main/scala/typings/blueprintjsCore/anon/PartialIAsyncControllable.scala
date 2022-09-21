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
  
  inline def apply(): PartialIAsyncControllable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIAsyncControllable]
  }
  
  extension [Self <: PartialIAsyncControllable](x: Self) {
    
    inline def setHasPendingUpdate(value: Boolean): Self = StObject.set(x, "hasPendingUpdate", value.asInstanceOf[js.Any])
    
    inline def setHasPendingUpdateUndefined: Self = StObject.set(x, "hasPendingUpdate", js.undefined)
    
    inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    inline def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
    
    inline def setNextValue(value: InputValue): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
    
    inline def setNextValueUndefined: Self = StObject.set(x, "nextValue", js.undefined)
    
    inline def setNextValueVarargs(value: String*): Self = StObject.set(x, "nextValue", js.Array(value*))
    
    inline def setValue(value: InputValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
