package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-02`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `248` extends StObject {
  
  var name: `spacing-02`
  
  var `type`: layout
}
object `248` {
  
  inline def apply(): `248` = {
    val __obj = js.Dynamic.literal(name = "spacing-02")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`248`]
  }
  
  extension [Self <: `248`](x: Self) {
    
    inline def setName(value: `spacing-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
