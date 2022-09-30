package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-magenta`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `186` extends StObject {
  
  var name: `tag-background-magenta`
  
  var `type`: color
}
object `186` {
  
  inline def apply(): `186` = {
    val __obj = js.Dynamic.literal(name = "tag-background-magenta")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`186`]
  }
  
  extension [Self <: `186`](x: Self) {
    
    inline def setName(value: `tag-background-magenta`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
