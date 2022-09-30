package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `281` extends StObject {
  
  var name: `text-01`
  
  var `type`: color
}
object `281` {
  
  inline def apply(): `281` = {
    val __obj = js.Dynamic.literal(name = "text-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`281`]
  }
  
  extension [Self <: `281`](x: Self) {
    
    inline def setName(value: `text-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
