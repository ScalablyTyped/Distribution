package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`brand-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `331` extends StObject {
  
  var name: `brand-01`
  
  var `type`: color
}
object `331` {
  
  inline def apply(): `331` = {
    val __obj = js.Dynamic.literal(name = "brand-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`331`]
  }
  
  extension [Self <: `331`](x: Self) {
    
    inline def setName(value: `brand-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
