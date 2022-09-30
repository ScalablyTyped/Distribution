package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-background-purple`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  var name: `tag-background-purple`
  
  var `type`: color
}
object `189` {
  
  inline def apply(): `189` = {
    val __obj = js.Dynamic.literal(name = "tag-background-purple")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`189`]
  }
  
  extension [Self <: `189`](x: Self) {
    
    inline def setName(value: `tag-background-purple`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
