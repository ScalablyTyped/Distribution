package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`container-01`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `264` extends StObject {
  
  var name: `container-01`
  
  var `type`: layout
}
object `264` {
  
  inline def apply(): `264` = {
    val __obj = js.Dynamic.literal(name = "container-01")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`264`]
  }
  
  extension [Self <: `264`](x: Self) {
    
    inline def setName(value: `container-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
