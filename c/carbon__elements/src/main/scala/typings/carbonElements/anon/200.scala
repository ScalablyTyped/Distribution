package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-teal`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var name: `tag-hover-teal`
  
  var `type`: color
}
object `200` {
  
  inline def apply(): `200` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-teal")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`200`]
  }
  
  extension [Self <: `200`](x: Self) {
    
    inline def setName(value: `tag-hover-teal`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
