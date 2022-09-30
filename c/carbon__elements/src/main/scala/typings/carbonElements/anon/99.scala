package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var name: `border-inverse`
  
  var `type`: color
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal(name = "border-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setName(value: `border-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
