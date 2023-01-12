package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.color
import typings.carbonElements.carbonElementsStrings.shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var name: shadow
  
  var `type`: color
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal(name = "shadow")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `139`] (val x: Self) extends AnyVal {
    
    inline def setName(value: shadow): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
