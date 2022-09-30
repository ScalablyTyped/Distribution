package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`ui-04`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `279` extends StObject {
  
  var name: `ui-04`
  
  var `type`: color
}
object `279` {
  
  inline def apply(): `279` = {
    val __obj = js.Dynamic.literal(name = "ui-04")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`279`]
  }
  
  extension [Self <: `279`](x: Self) {
    
    inline def setName(value: `ui-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
