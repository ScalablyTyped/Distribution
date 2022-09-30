package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  var name: `button-secondary`
  
  var `type`: color
}
object `160` {
  
  inline def apply(): `160` = {
    val __obj = js.Dynamic.literal(name = "button-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def setName(value: `button-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
