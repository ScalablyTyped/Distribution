package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-light-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `314` extends StObject {
  
  var name: `hover-light-ui`
  
  var `type`: color
}
object `314` {
  
  inline def apply(): `314` = {
    val __obj = js.Dynamic.literal(name = "hover-light-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`314`]
  }
  
  extension [Self <: `314`](x: Self) {
    
    inline def setName(value: `hover-light-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
