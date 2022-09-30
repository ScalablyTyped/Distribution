package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`disabled-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `326` extends StObject {
  
  var name: `disabled-02`
  
  var `type`: color
}
object `326` {
  
  inline def apply(): `326` = {
    val __obj = js.Dynamic.literal(name = "disabled-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`326`]
  }
  
  extension [Self <: `326`](x: Self) {
    
    inline def setName(value: `disabled-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
