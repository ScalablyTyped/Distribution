package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `283` extends StObject {
  
  var name: `text-03`
  
  var `type`: color
}
object `283` {
  
  inline def apply(): `283` = {
    val __obj = js.Dynamic.literal(name = "text-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`283`]
  }
  
  extension [Self <: `283`](x: Self) {
    
    inline def setName(value: `text-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
