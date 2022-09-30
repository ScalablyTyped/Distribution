package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `282` extends StObject {
  
  var name: `text-02`
  
  var `type`: color
}
object `282` {
  
  inline def apply(): `282` = {
    val __obj = js.Dynamic.literal(name = "text-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`282`]
  }
  
  extension [Self <: `282`](x: Self) {
    
    inline def setName(value: `text-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
