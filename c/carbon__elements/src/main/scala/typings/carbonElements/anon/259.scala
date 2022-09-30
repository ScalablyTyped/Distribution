package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-13`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259` extends StObject {
  
  var name: `spacing-13`
  
  var `type`: layout
}
object `259` {
  
  inline def apply(): `259` = {
    val __obj = js.Dynamic.literal(name = "spacing-13")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`259`]
  }
  
  extension [Self <: `259`](x: Self) {
    
    inline def setName(value: `spacing-13`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
