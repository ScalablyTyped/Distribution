package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`active-tertiary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `312` extends StObject {
  
  var name: `active-tertiary`
  
  var `type`: color
}
object `312` {
  
  inline def apply(): `312` = {
    val __obj = js.Dynamic.literal(name = "active-tertiary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`312`]
  }
  
  extension [Self <: `312`](x: Self) {
    
    inline def setName(value: `active-tertiary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
