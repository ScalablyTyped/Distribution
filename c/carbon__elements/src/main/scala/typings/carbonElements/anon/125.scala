package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-error`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var name: `support-error`
  
  var `type`: color
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal(name = "support-error")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setName(value: `support-error`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
