package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-inverse-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var name: `background-inverse-hover`
  
  var `type`: color
}
object `51` {
  
  inline def apply(): `51` = {
    val __obj = js.Dynamic.literal(name = "background-inverse-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setName(value: `background-inverse-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
