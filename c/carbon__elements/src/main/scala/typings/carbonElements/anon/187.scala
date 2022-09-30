package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-magenta`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var name: `tag-color-magenta`
  
  var `type`: color
}
object `187` {
  
  inline def apply(): `187` = {
    val __obj = js.Dynamic.literal(name = "tag-color-magenta")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`187`]
  }
  
  extension [Self <: `187`](x: Self) {
    
    inline def setName(value: `tag-color-magenta`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
