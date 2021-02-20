package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait ReadonlyITagInputState extends StObject {
  
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
  implicit class ReadonlyITagInputStateMutableBuilder[Self <: ReadonlyITagInputState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
  }
}
