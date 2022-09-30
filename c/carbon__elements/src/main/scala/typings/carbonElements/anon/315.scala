package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-selected-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `315` extends StObject {
  
  var name: `hover-selected-ui`
  
  var `type`: color
}
object `315` {
  
  inline def apply(): `315` = {
    val __obj = js.Dynamic.literal(name = "hover-selected-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`315`]
  }
  
  extension [Self <: `315`](x: Self) {
    
    inline def setName(value: `hover-selected-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
