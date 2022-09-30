package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`code-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  var name: `code-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `224` {
  
  inline def apply(): `224` = {
    val __obj = js.Dynamic.literal(name = "code-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`224`]
  }
  
  extension [Self <: `224`](x: Self) {
    
    inline def setName(value: `code-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
