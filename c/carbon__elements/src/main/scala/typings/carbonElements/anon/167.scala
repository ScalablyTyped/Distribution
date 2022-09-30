package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-tertiary-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `167` extends StObject {
  
  var name: `button-tertiary-active`
  
  var `type`: color
}
object `167` {
  
  inline def apply(): `167` = {
    val __obj = js.Dynamic.literal(name = "button-tertiary-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`167`]
  }
  
  extension [Self <: `167`](x: Self) {
    
    inline def setName(value: `button-tertiary-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
