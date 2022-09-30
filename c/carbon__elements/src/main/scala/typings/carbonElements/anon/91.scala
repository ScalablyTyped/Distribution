package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-selected-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var name: `border-subtle-selected-01`
  
  var `type`: color
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-selected-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setName(value: `border-subtle-selected-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
