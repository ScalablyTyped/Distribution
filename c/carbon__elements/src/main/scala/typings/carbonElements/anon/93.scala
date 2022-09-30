package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-selected-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var name: `border-subtle-selected-02`
  
  var `type`: color
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-selected-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`93`]
  }
  
  extension [Self <: `93`](x: Self) {
    
    inline def setName(value: `border-subtle-selected-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
