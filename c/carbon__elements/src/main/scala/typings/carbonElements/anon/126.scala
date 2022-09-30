package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-success`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `126` extends StObject {
  
  var name: `support-success`
  
  var `type`: color
}
object `126` {
  
  inline def apply(): `126` = {
    val __obj = js.Dynamic.literal(name = "support-success")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`126`]
  }
  
  extension [Self <: `126`](x: Self) {
    
    inline def setName(value: `support-success`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
