package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `313` extends StObject {
  
  var name: `hover-ui`
  
  var `type`: color
}
object `313` {
  
  inline def apply(): `313` = {
    val __obj = js.Dynamic.literal(name = "hover-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`313`]
  }
  
  extension [Self <: `313`](x: Self) {
    
    inline def setName(value: `hover-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
