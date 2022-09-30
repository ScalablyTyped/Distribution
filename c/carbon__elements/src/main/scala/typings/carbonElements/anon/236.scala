package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`expressive-heading-03`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  var name: `expressive-heading-03`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `236` {
  
  inline def apply(): `236` = {
    val __obj = js.Dynamic.literal(name = "expressive-heading-03")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`236`]
  }
  
  extension [Self <: `236`](x: Self) {
    
    inline def setName(value: `expressive-heading-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
