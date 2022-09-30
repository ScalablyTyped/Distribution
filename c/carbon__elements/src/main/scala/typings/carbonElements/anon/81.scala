package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var name: `field-01`
  
  var `type`: color
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal(name = "field-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setName(value: `field-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
