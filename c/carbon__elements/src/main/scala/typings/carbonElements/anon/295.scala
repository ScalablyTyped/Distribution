package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `295` extends StObject {
  
  var name: `support-02`
  
  var `type`: color
}
object `295` {
  
  inline def apply(): `295` = {
    val __obj = js.Dynamic.literal(name = "support-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`295`]
  }
  
  extension [Self <: `295`](x: Self) {
    
    inline def setName(value: `support-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
