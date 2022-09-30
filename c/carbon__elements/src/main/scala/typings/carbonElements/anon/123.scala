package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-on-color-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  var name: `icon-on-color-disabled`
  
  var `type`: color
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal(name = "icon-on-color-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setName(value: `icon-on-color-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
