package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`body-long-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var name: `body-long-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `220` {
  
  inline def apply(): `220` = {
    val __obj = js.Dynamic.literal(name = "body-long-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`220`]
  }
  
  extension [Self <: `220`](x: Self) {
    
    inline def setName(value: `body-long-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
