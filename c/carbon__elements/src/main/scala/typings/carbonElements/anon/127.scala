package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-warning`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var name: `support-warning`
  
  var `type`: color
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal(name = "support-warning")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setName(value: `support-warning`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
