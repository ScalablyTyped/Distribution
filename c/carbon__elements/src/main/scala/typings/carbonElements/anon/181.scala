package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse-text`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var name: `notification-action-tertiary-inverse-text`
  
  var `type`: color
}
object `181` {
  
  inline def apply(): `181` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse-text")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`181`]
  }
  
  extension [Self <: `181`](x: Self) {
    
    inline def setName(value: `notification-action-tertiary-inverse-text`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
