package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `294` extends StObject {
  
  var name: `support-01`
  
  var `type`: color
}
object `294` {
  
  inline def apply(): `294` = {
    val __obj = js.Dynamic.literal(name = "support-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`294`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `294`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `support-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
