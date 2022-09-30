package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-danger-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var name: `button-danger-secondary`
  
  var `type`: color
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal(name = "button-danger-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`163`]
  }
  
  extension [Self <: `163`](x: Self) {
    
    inline def setName(value: `button-danger-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
