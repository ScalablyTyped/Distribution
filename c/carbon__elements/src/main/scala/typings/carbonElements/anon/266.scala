package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`container-03`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `266` extends StObject {
  
  var name: `container-03`
  
  var `type`: layout
}
object `266` {
  
  inline def apply(): `266` = {
    val __obj = js.Dynamic.literal(name = "container-03")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`266`]
  }
  
  extension [Self <: `266`](x: Self) {
    
    inline def setName(value: `container-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
