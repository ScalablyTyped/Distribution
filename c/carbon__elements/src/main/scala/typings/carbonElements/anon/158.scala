package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-separator`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var name: `button-separator`
  
  var `type`: color
}
object `158` {
  
  inline def apply(): `158` = {
    val __obj = js.Dynamic.literal(name = "button-separator")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`158`]
  }
  
  extension [Self <: `158`](x: Self) {
    
    inline def setName(value: `button-separator`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
