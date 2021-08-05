package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHighlighted extends StObject {
  
  @JSName("$disabled")
  var $disabled: Boolean
  
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  
  @JSName("$selected")
  var $selected: Boolean
}
object IsHighlighted {
  
  inline def apply($disabled: Boolean, $isHighlighted: Boolean, $selected: Boolean): IsHighlighted = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $selected = $selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHighlighted]
  }
  
  extension [Self <: IsHighlighted](x: Self) {
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def set$selected(value: Boolean): Self = StObject.set(x, "$selected", value.asInstanceOf[js.Any])
  }
}
