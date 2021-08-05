package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
trait PartialITagInputState extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var isInputFocused: js.UndefOr[Boolean] = js.undefined
  
  var prevInputValueProp: js.UndefOr[String] = js.undefined
}
object PartialITagInputState {
  
  inline def apply(): PartialITagInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITagInputState]
  }
  
  extension [Self <: PartialITagInputState](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
    
    inline def setIsInputFocusedUndefined: Self = StObject.set(x, "isInputFocused", js.undefined)
    
    inline def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
    
    inline def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
  }
}
