package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-05`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `285` extends StObject {
  
  var name: `text-05`
  
  var `type`: color
}
object `285` {
  
  inline def apply(): `285` = {
    val __obj = js.Dynamic.literal(name = "text-05")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`285`]
  }
  
  extension [Self <: `285`](x: Self) {
    
    inline def setName(value: `text-05`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
