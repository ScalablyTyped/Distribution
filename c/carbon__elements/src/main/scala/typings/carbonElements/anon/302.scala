package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`overlay-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `302` extends StObject {
  
  var name: `overlay-01`
  
  var `type`: color
}
object `302` {
  
  inline def apply(): `302` = {
    val __obj = js.Dynamic.literal(name = "overlay-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`302`]
  }
  
  extension [Self <: `302`](x: Self) {
    
    inline def setName(value: `overlay-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
