package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`expressive-heading-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  var name: `expressive-heading-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `235` {
  
  inline def apply(): `235` = {
    val __obj = js.Dynamic.literal(name = "expressive-heading-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`235`]
  }
  
  extension [Self <: `235`](x: Self) {
    
    inline def setName(value: `expressive-heading-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
