package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`ui-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `277` extends StObject {
  
  var name: `ui-02`
  
  var `type`: color
}
object `277` {
  
  inline def apply(): `277` = {
    val __obj = js.Dynamic.literal(name = "ui-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`277`]
  }
  
  extension [Self <: `277`](x: Self) {
    
    inline def setName(value: `ui-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
