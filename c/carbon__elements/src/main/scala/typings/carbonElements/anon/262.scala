package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`fluid-spacing-03`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `262` extends StObject {
  
  var name: `fluid-spacing-03`
  
  var `type`: layout
}
object `262` {
  
  inline def apply(): `262` = {
    val __obj = js.Dynamic.literal(name = "fluid-spacing-03")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`262`]
  }
  
  extension [Self <: `262`](x: Self) {
    
    inline def setName(value: `fluid-spacing-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
