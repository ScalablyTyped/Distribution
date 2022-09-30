package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-danger`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `321` extends StObject {
  
  var name: `hover-danger`
  
  var `type`: color
}
object `321` {
  
  inline def apply(): `321` = {
    val __obj = js.Dynamic.literal(name = "hover-danger")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`321`]
  }
  
  extension [Self <: `321`](x: Self) {
    
    inline def setName(value: `hover-danger`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
