package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-hover-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var name: `layer-hover-01`
  
  var `type`: color
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal(name = "layer-hover-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setName(value: `layer-hover-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
