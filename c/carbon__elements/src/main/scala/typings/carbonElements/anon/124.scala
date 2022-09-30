package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `124` extends StObject {
  
  var name: `icon-disabled`
  
  var `type`: color
}
object `124` {
  
  inline def apply(): `124` = {
    val __obj = js.Dynamic.literal(name = "icon-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`124`]
  }
  
  extension [Self <: `124`](x: Self) {
    
    inline def setName(value: `icon-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
