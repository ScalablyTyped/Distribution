package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait None extends StObject {
  
  var `medium-icon`: X
  
  var `medium-text`: X
  
  var none: Any
  
  var small: X
  
  var `x-small`: X
}
object None {
  
  inline def apply(`medium-icon`: X, `medium-text`: X, none: Any, small: X, `x-small`: X): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.updateDynamic("medium-icon")(`medium-icon`.asInstanceOf[js.Any])
    __obj.updateDynamic("medium-text")(`medium-text`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-small")(`x-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  
  extension [Self <: None](x: Self) {
    
    inline def `setMedium-icon`(value: X): Self = StObject.set(x, "medium-icon", value.asInstanceOf[js.Any])
    
    inline def `setMedium-text`(value: X): Self = StObject.set(x, "medium-text", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: X): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def `setX-small`(value: X): Self = StObject.set(x, "x-small", value.asInstanceOf[js.Any])
  }
}
