package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-cool-gray`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var name: `tag-color-cool-gray`
  
  var `type`: color
}
object `208` {
  
  inline def apply(): `208` = {
    val __obj = js.Dynamic.literal(name = "tag-color-cool-gray")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`208`]
  }
  
  extension [Self <: `208`](x: Self) {
    
    inline def setName(value: `tag-color-cool-gray`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
