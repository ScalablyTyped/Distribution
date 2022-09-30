package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-caution-minor`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var name: `support-caution-minor`
  
  var `type`: color
}
object `134` {
  
  inline def apply(): `134` = {
    val __obj = js.Dynamic.literal(name = "support-caution-minor")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setName(value: `support-caution-minor`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
