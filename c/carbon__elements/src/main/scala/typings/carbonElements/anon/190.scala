package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-purple`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  var name: `tag-color-purple`
  
  var `type`: color
}
object `190` {
  
  inline def apply(): `190` = {
    val __obj = js.Dynamic.literal(name = "tag-color-purple")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`190`]
  }
  
  extension [Self <: `190`](x: Self) {
    
    inline def setName(value: `tag-color-purple`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
