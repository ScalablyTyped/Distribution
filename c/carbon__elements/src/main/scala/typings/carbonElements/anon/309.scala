package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-secondary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `309` extends StObject {
  
  var name: `hover-secondary`
  
  var `type`: color
}
object `309` {
  
  inline def apply(): `309` = {
    val __obj = js.Dynamic.literal(name = "hover-secondary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`309`]
  }
  
  extension [Self <: `309`](x: Self) {
    
    inline def setName(value: `hover-secondary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
