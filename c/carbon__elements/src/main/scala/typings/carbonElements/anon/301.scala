package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`inverse-support-04`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301` extends StObject {
  
  var name: `inverse-support-04`
  
  var `type`: color
}
object `301` {
  
  inline def apply(): `301` = {
    val __obj = js.Dynamic.literal(name = "inverse-support-04")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`301`]
  }
  
  extension [Self <: `301`](x: Self) {
    
    inline def setName(value: `inverse-support-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
