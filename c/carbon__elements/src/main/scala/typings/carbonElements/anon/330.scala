package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`skeleton-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `330` extends StObject {
  
  var name: `skeleton-02`
  
  var `type`: color
}
object `330` {
  
  inline def apply(): `330` = {
    val __obj = js.Dynamic.literal(name = "skeleton-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`330`]
  }
  
  extension [Self <: `330`](x: Self) {
    
    inline def setName(value: `skeleton-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
