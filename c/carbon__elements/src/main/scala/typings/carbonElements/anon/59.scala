package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-hover-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var name: `layer-hover-02`
  
  var `type`: color
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal(name = "layer-hover-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setName(value: `layer-hover-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
