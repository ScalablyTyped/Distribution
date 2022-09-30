package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  var name: `notification-action-tertiary-inverse`
  
  var `type`: color
}
object `178` {
  
  inline def apply(): `178` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`178`]
  }
  
  extension [Self <: `178`](x: Self) {
    
    inline def setName(value: `notification-action-tertiary-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
