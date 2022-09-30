package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`helper-text-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var name: `helper-text-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `217` {
  
  inline def apply(): `217` = {
    val __obj = js.Dynamic.literal(name = "helper-text-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`217`]
  }
  
  extension [Self <: `217`](x: Self) {
    
    inline def setName(value: `helper-text-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
