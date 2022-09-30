package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-on-color`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var name: `text-on-color`
  
  var `type`: color
}
object `109` {
  
  inline def apply(): `109` = {
    val __obj = js.Dynamic.literal(name = "text-on-color")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setName(value: `text-on-color`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
