package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.ITagInputState> */
@js.native
trait PartialITagInputState extends StObject {
  
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
  implicit class PartialITagInputStateMutableBuilder[Self <: PartialITagInputState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setIsInputFocused(value: Boolean): Self = StObject.set(x, "isInputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInputFocusedUndefined: Self = StObject.set(x, "isInputFocused", js.undefined)
    
    @scala.inline
    def setPrevInputValueProp(value: String): Self = StObject.set(x, "prevInputValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInputValuePropUndefined: Self = StObject.set(x, "prevInputValueProp", js.undefined)
  }
}
