package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-12`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `258` extends StObject {
  
  var name: `spacing-12`
  
  var `type`: layout
}
object `258` {
  
  inline def apply(): `258` = {
    val __obj = js.Dynamic.literal(name = "spacing-12")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`258`]
  }
  
  extension [Self <: `258`](x: Self) {
    
    inline def setName(value: `spacing-12`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
