package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-hover-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var name: `layer-selected-hover-03`
  
  var `type`: color
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-hover-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setName(value: `layer-selected-hover-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
