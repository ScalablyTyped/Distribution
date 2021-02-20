package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends StObject {
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  
  @JSName("$selected")
  var $selected: js.UndefOr[Boolean] = js.native
}
object Disabled {
  
  @scala.inline
  def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    @scala.inline
    def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$selectedUndefined: Self = StObject.set(x, "$selected", js.undefined)
  }
}
