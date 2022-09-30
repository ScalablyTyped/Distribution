package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-visited`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var name: `link-visited`
  
  var `type`: color
}
object `115` {
  
  inline def apply(): `115` = {
    val __obj = js.Dynamic.literal(name = "link-visited")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setName(value: `link-visited`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
