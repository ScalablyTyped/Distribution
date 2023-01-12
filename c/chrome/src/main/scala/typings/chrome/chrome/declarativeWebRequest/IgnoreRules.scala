package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreRules extends StObject {
  
  var lowerPriorityThan: Double
}
object IgnoreRules {
  
  inline def apply(lowerPriorityThan: Double): IgnoreRules = {
    val __obj = js.Dynamic.literal(lowerPriorityThan = lowerPriorityThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreRules] (val x: Self) extends AnyVal {
    
    inline def setLowerPriorityThan(value: Double): Self = StObject.set(x, "lowerPriorityThan", value.asInstanceOf[js.Any])
  }
}
