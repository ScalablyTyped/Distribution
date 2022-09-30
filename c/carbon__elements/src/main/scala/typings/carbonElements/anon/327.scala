package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`disabled-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327` extends StObject {
  
  var name: `disabled-03`
  
  var `type`: color
}
object `327` {
  
  inline def apply(): `327` = {
    val __obj = js.Dynamic.literal(name = "disabled-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`327`]
  }
  
  extension [Self <: `327`](x: Self) {
    
    inline def setName(value: `disabled-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
