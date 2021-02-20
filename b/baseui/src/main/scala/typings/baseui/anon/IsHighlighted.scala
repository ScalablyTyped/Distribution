package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHighlighted extends StObject {
  
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean = js.native
  
  @JSName("$selected")
  var $selected: Boolean = js.native
}
object IsHighlighted {
  
  @scala.inline
  def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): IsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  
  @scala.inline
  implicit class IsHighlightedMutableBuilder[Self <: IsHighlighted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
  }
}
