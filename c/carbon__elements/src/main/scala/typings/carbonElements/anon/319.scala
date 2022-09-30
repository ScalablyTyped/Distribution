package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`selected-light-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `319` extends StObject {
  
  var name: `selected-light-ui`
  
  var `type`: color
}
object `319` {
  
  inline def apply(): `319` = {
    val __obj = js.Dynamic.literal(name = "selected-light-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`319`]
  }
  
  extension [Self <: `319`](x: Self) {
    
    inline def setName(value: `selected-light-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
