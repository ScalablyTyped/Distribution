package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-brand`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var name: `background-brand`
  
  var `type`: color
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal(name = "background-brand")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setName(value: `background-brand`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
