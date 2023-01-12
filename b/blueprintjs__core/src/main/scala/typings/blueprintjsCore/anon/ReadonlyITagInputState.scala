package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
trait ReadonlyITagInputState extends StObject {
  
  val activeIndex: Double
  
  val inputValue: String
  
  val isInputFocused: Boolean
  
  val prevInputValueProp: js.UndefOr[String] = js.undefined
}
object ReadonlyITagInputState {
  
  inline def apply(activeIndex: Double, inputValue: String, isInputFocused: Boolean): ReadonlyITagInputState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isInputFocused = isInputFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyITagInputState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyITagInputState] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
    
    inline def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
    
    inline def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
  }
}
