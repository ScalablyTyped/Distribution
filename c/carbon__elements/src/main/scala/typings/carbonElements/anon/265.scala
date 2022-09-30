package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`container-02`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `265` extends StObject {
  
  var name: `container-02`
  
  var `type`: layout
}
object `265` {
  
  inline def apply(): `265` = {
    val __obj = js.Dynamic.literal(name = "container-02")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`265`]
  }
  
  extension [Self <: `265`](x: Self) {
    
    inline def setName(value: `container-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
