package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-danger-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  var name: `button-danger-primary`
  
  var `type`: color
}
object `162` {
  
  inline def apply(): `162` = {
    val __obj = js.Dynamic.literal(name = "button-danger-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `162`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-danger-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
