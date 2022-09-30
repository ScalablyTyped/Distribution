package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`caption-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `214` extends StObject {
  
  var name: `caption-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `214` {
  
  inline def apply(): `214` = {
    val __obj = js.Dynamic.literal(name = "caption-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`214`]
  }
  
  extension [Self <: `214`](x: Self) {
    
    inline def setName(value: `caption-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
