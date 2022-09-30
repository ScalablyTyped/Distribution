package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-hover-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var name: `field-hover-03`
  
  var `type`: color
}
object `86` {
  
  inline def apply(): `86` = {
    val __obj = js.Dynamic.literal(name = "field-hover-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setName(value: `field-hover-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
