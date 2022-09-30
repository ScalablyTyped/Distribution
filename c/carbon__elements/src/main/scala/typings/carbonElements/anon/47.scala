package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var name: `background-hover`
  
  var `type`: color
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal(name = "background-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setName(value: `background-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
