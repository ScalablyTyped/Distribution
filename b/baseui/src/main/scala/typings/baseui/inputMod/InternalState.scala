package typings.baseui.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalState extends StObject {
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var isMasked: js.UndefOr[Boolean] = js.undefined
}
object InternalState {
  
  @scala.inline
  def apply(): InternalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalState]
  }
  
  @scala.inline
  implicit class InternalStateMutableBuilder[Self <: InternalState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsMasked(value: Boolean): Self = StObject.set(x, "isMasked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMaskedUndefined: Self = StObject.set(x, "isMasked", js.undefined)
  }
}
