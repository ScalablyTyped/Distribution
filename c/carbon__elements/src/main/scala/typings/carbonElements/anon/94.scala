package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var name: `border-subtle-03`
  
  var `type`: color
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setName(value: `border-subtle-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
