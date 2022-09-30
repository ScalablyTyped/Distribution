package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`ui-05`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `280` extends StObject {
  
  var name: `ui-05`
  
  var `type`: color
}
object `280` {
  
  inline def apply(): `280` = {
    val __obj = js.Dynamic.literal(name = "ui-05")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`280`]
  }
  
  extension [Self <: `280`](x: Self) {
    
    inline def setName(value: `ui-05`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
