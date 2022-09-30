package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`danger-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `304` extends StObject {
  
  var name: `danger-02`
  
  var `type`: color
}
object `304` {
  
  inline def apply(): `304` = {
    val __obj = js.Dynamic.literal(name = "danger-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`304`]
  }
  
  extension [Self <: `304`](x: Self) {
    
    inline def setName(value: `danger-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
