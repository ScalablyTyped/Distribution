package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-hover-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var name: `field-hover-01`
  
  var `type`: color
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal(name = "field-hover-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setName(value: `field-hover-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
