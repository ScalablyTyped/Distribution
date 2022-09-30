package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-strong`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var name: `border-strong`
  
  var `type`: color
}
object `157` {
  
  inline def apply(): `157` = {
    val __obj = js.Dynamic.literal(name = "border-strong")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`157`]
  }
  
  extension [Self <: `157`](x: Self) {
    
    inline def setName(value: `border-strong`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
