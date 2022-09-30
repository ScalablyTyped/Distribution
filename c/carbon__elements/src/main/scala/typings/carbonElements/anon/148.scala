package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var name: `layer-selected`
  
  var `type`: color
}
object `148` {
  
  inline def apply(): `148` = {
    val __obj = js.Dynamic.literal(name = "layer-selected")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setName(value: `layer-selected`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
