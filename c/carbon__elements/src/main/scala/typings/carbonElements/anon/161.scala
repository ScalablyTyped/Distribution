package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-tertiary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var name: `button-tertiary`
  
  var `type`: color
}
object `161` {
  
  inline def apply(): `161` = {
    val __obj = js.Dynamic.literal(name = "button-tertiary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setName(value: `button-tertiary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
