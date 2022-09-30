package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-red`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var name: `tag-hover-red`
  
  var `type`: color
}
object `185` {
  
  inline def apply(): `185` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-red")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`185`]
  }
  
  extension [Self <: `185`](x: Self) {
    
    inline def setName(value: `tag-hover-red`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
