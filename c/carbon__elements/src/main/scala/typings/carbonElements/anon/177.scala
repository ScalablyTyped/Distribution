package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-action-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `177` extends StObject {
  
  var name: `notification-action-hover`
  
  var `type`: color
}
object `177` {
  
  inline def apply(): `177` = {
    val __obj = js.Dynamic.literal(name = "notification-action-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`177`]
  }
  
  extension [Self <: `177`](x: Self) {
    
    inline def setName(value: `notification-action-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
