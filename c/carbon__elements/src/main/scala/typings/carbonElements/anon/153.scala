package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.color
import typings.carbonElements.carbonElementsStrings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var name: field
  
  var `type`: color
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal(name = "field")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setName(value: field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
