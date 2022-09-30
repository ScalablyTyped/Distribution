package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-hover-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var name: `layer-hover-03`
  
  var `type`: color
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal(name = "layer-hover-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setName(value: `layer-hover-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
