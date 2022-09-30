package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`display-04`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  var name: `display-04`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `246` {
  
  inline def apply(): `246` = {
    val __obj = js.Dynamic.literal(name = "display-04")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`246`]
  }
  
  extension [Self <: `246`](x: Self) {
    
    inline def setName(value: `display-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
