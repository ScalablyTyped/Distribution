package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-background-warning`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176` extends StObject {
  
  var name: `notification-background-warning`
  
  var `type`: color
}
object `176` {
  
  inline def apply(): `176` = {
    val __obj = js.Dynamic.literal(name = "notification-background-warning")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`176`]
  }
  
  extension [Self <: `176`](x: Self) {
    
    inline def setName(value: `notification-background-warning`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
