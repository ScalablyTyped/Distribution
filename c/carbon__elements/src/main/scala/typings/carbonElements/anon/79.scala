package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-hover-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var name: `layer-accent-hover-03`
  
  var `type`: color
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-hover-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setName(value: `layer-accent-hover-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
