package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-warm-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  var name: `tag-color-warm-gray`
  
  var `type`: color
}
object `211` {
  
  inline def apply(): `211` = {
    val __obj = js.Dynamic.literal(name = "tag-color-warm-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`211`]
  }
  
  extension [Self <: `211`](x: Self) {
    
    inline def setName(value: `tag-color-warm-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
