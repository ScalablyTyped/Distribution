package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`interactive-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `271` extends StObject {
  
  var name: `interactive-01`
  
  var `type`: color
}
object `271` {
  
  inline def apply(): `271` = {
    val __obj = js.Dynamic.literal(name = "interactive-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`271`]
  }
  
  extension [Self <: `271`](x: Self) {
    
    inline def setName(value: `interactive-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
