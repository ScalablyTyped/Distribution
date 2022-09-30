package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`active-light-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `317` extends StObject {
  
  var name: `active-light-ui`
  
  var `type`: color
}
object `317` {
  
  inline def apply(): `317` = {
    val __obj = js.Dynamic.literal(name = "active-light-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`317`]
  }
  
  extension [Self <: `317`](x: Self) {
    
    inline def setName(value: `active-light-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
