package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-active-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var name: `layer-active-02`
  
  var `type`: color
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(name = "layer-active-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setName(value: `layer-active-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
