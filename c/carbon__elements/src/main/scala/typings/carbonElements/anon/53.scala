package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-active-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var name: `layer-active-01`
  
  var `type`: color
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal(name = "layer-active-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setName(value: `layer-active-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
