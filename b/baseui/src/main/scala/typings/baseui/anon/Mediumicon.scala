package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mediumicon extends StObject {
  
  var `medium-icon`: Any
  
  var `medium-text`: Any
  
  var none: Any
  
  var small: Any
  
  var `x-small`: X
}
object Mediumicon {
  
  inline def apply(`medium-icon`: Any, `medium-text`: Any, none: Any, small: Any, `x-small`: X): Mediumicon = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.updateDynamic("medium-icon")(`medium-icon`.asInstanceOf[js.Any])
    __obj.updateDynamic("medium-text")(`medium-text`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-small")(`x-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mediumicon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mediumicon] (val x: Self) extends AnyVal {
    
    inline def `setMedium-icon`(value: Any): Self = StObject.set(x, "medium-icon", value.asInstanceOf[js.Any])
    
    inline def `setMedium-text`(value: Any): Self = StObject.set(x, "medium-text", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Any): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def `setX-small`(value: X): Self = StObject.set(x, "x-small", value.asInstanceOf[js.Any])
  }
}
