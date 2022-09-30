package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-02`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `338` extends StObject {
  
  var name: `layout-02`
  
  var `type`: layout
}
object `338` {
  
  inline def apply(): `338` = {
    val __obj = js.Dynamic.literal(name = "layout-02")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`338`]
  }
  
  extension [Self <: `338`](x: Self) {
    
    inline def setName(value: `layout-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
