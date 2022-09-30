package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`body-short-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221` extends StObject {
  
  var name: `body-short-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `221` {
  
  inline def apply(): `221` = {
    val __obj = js.Dynamic.literal(name = "body-short-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`221`]
  }
  
  extension [Self <: `221`](x: Self) {
    
    inline def setName(value: `body-short-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
