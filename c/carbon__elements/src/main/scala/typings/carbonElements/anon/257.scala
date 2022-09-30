package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-11`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `257` extends StObject {
  
  var name: `spacing-11`
  
  var `type`: layout
}
object `257` {
  
  inline def apply(): `257` = {
    val __obj = js.Dynamic.literal(name = "spacing-11")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`257`]
  }
  
  extension [Self <: `257`](x: Self) {
    
    inline def setName(value: `spacing-11`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
