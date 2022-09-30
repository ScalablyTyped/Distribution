package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-caution-undefined`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var name: `support-caution-undefined`
  
  var `type`: color
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal(name = "support-caution-undefined")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setName(value: `support-caution-undefined`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
