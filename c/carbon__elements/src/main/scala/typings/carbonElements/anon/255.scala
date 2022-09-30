package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-09`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255` extends StObject {
  
  var name: `spacing-09`
  
  var `type`: layout
}
object `255` {
  
  inline def apply(): `255` = {
    val __obj = js.Dynamic.literal(name = "spacing-09")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`255`]
  }
  
  extension [Self <: `255`](x: Self) {
    
    inline def setName(value: `spacing-09`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
