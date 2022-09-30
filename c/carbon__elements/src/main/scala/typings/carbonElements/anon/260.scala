package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`fluid-spacing-01`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `260` extends StObject {
  
  var name: `fluid-spacing-01`
  
  var `type`: layout
}
object `260` {
  
  inline def apply(): `260` = {
    val __obj = js.Dynamic.literal(name = "fluid-spacing-01")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`260`]
  }
  
  extension [Self <: `260`](x: Self) {
    
    inline def setName(value: `fluid-spacing-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
