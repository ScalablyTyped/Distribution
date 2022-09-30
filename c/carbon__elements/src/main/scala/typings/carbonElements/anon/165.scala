package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-primary-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  var name: `button-primary-active`
  
  var `type`: color
}
object `165` {
  
  inline def apply(): `165` = {
    val __obj = js.Dynamic.literal(name = "button-primary-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`165`]
  }
  
  extension [Self <: `165`](x: Self) {
    
    inline def setName(value: `button-primary-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
