package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`selected-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `318` extends StObject {
  
  var name: `selected-ui`
  
  var `type`: color
}
object `318` {
  
  inline def apply(): `318` = {
    val __obj = js.Dynamic.literal(name = "selected-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`318`]
  }
  
  extension [Self <: `318`](x: Self) {
    
    inline def setName(value: `selected-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
