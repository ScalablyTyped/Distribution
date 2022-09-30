package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-danger-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var name: `button-danger-active`
  
  var `type`: color
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal(name = "button-danger-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setName(value: `button-danger-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
