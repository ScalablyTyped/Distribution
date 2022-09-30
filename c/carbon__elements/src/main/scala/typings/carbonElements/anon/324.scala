package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`visited-link`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `324` extends StObject {
  
  var name: `visited-link`
  
  var `type`: color
}
object `324` {
  
  inline def apply(): `324` = {
    val __obj = js.Dynamic.literal(name = "visited-link")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`324`]
  }
  
  extension [Self <: `324`](x: Self) {
    
    inline def setName(value: `visited-link`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
