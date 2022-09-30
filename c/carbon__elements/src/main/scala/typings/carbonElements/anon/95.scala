package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-selected-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var name: `border-subtle-selected-03`
  
  var `type`: color
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-selected-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setName(value: `border-subtle-selected-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
