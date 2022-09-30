package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-on-color`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var name: `icon-on-color`
  
  var `type`: color
}
object `122` {
  
  inline def apply(): `122` = {
    val __obj = js.Dynamic.literal(name = "icon-on-color")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setName(value: `icon-on-color`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
