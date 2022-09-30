package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`interactive-04`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `274` extends StObject {
  
  var name: `interactive-04`
  
  var `type`: color
}
object `274` {
  
  inline def apply(): `274` = {
    val __obj = js.Dynamic.literal(name = "interactive-04")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`274`]
  }
  
  extension [Self <: `274`](x: Self) {
    
    inline def setName(value: `interactive-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
