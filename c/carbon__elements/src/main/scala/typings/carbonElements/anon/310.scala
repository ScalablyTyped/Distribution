package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`active-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `310` extends StObject {
  
  var name: `active-secondary`
  
  var `type`: color
}
object `310` {
  
  inline def apply(): `310` = {
    val __obj = js.Dynamic.literal(name = "active-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`310`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `310`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `active-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
