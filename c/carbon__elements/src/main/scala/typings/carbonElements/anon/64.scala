package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-active-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var name: `layer-active-03`
  
  var `type`: color
}
object `64` {
  
  inline def apply(): `64` = {
    val __obj = js.Dynamic.literal(name = "layer-active-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`64`]
  }
  
  extension [Self <: `64`](x: Self) {
    
    inline def setName(value: `layer-active-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
