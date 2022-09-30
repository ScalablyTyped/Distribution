package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-red`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  var name: `tag-color-red`
  
  var `type`: color
}
object `184` {
  
  inline def apply(): `184` = {
    val __obj = js.Dynamic.literal(name = "tag-color-red")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`184`]
  }
  
  extension [Self <: `184`](x: Self) {
    
    inline def setName(value: `tag-color-red`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
