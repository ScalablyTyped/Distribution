package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-hover-magenta`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var name: `tag-hover-magenta`
  
  var `type`: color
}
object `188` {
  
  inline def apply(): `188` = {
    val __obj = js.Dynamic.literal(name = "tag-hover-magenta")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`188`]
  }
  
  extension [Self <: `188`](x: Self) {
    
    inline def setName(value: `tag-hover-magenta`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
