package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`body-long-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var name: `body-long-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `222` {
  
  inline def apply(): `222` = {
    val __obj = js.Dynamic.literal(name = "body-long-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`222`]
  }
  
  extension [Self <: `222`](x: Self) {
    
    inline def setName(value: `body-long-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
