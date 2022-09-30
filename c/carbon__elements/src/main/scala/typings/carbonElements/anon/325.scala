package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`disabled-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `325` extends StObject {
  
  var name: `disabled-01`
  
  var `type`: color
}
object `325` {
  
  inline def apply(): `325` = {
    val __obj = js.Dynamic.literal(name = "disabled-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`325`]
  }
  
  extension [Self <: `325`](x: Self) {
    
    inline def setName(value: `disabled-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
