package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`display-03`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `245` extends StObject {
  
  var name: `display-03`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `245` {
  
  inline def apply(): `245` = {
    val __obj = js.Dynamic.literal(name = "display-03")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`245`]
  }
  
  extension [Self <: `245`](x: Self) {
    
    inline def setName(value: `display-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
