package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var name: `layer-03`
  
  var `type`: color
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal(name = "layer-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setName(value: `layer-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
