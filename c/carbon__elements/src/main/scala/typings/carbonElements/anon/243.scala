package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`display-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  var name: `display-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal(name = "display-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`243`]
  }
  
  extension [Self <: `243`](x: Self) {
    
    inline def setName(value: `display-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
