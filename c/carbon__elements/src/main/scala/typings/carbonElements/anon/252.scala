package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-06`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `252` extends StObject {
  
  var name: `spacing-06`
  
  var `type`: layout
}
object `252` {
  
  inline def apply(): `252` = {
    val __obj = js.Dynamic.literal(name = "spacing-06")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`252`]
  }
  
  extension [Self <: `252`](x: Self) {
    
    inline def setName(value: `spacing-06`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
