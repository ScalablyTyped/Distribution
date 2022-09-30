package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-warm-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var name: `tag-background-warm-gray`
  
  var `type`: color
}
object `210` {
  
  inline def apply(): `210` = {
    val __obj = js.Dynamic.literal(name = "tag-background-warm-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`210`]
  }
  
  extension [Self <: `210`](x: Self) {
    
    inline def setName(value: `tag-background-warm-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
