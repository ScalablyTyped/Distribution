package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`helper-text-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `218` extends StObject {
  
  var name: `helper-text-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `218` {
  
  inline def apply(): `218` = {
    val __obj = js.Dynamic.literal(name = "helper-text-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`218`]
  }
  
  extension [Self <: `218`](x: Self) {
    
    inline def setName(value: `helper-text-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
