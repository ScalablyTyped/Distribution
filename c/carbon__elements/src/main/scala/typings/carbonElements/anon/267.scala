package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`container-04`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `267` extends StObject {
  
  var name: `container-04`
  
  var `type`: layout
}
object `267` {
  
  inline def apply(): `267` = {
    val __obj = js.Dynamic.literal(name = "container-04")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`267`]
  }
  
  extension [Self <: `267`](x: Self) {
    
    inline def setName(value: `container-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
