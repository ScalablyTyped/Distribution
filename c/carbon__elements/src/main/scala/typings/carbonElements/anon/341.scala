package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-05`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `341` extends StObject {
  
  var name: `layout-05`
  
  var `type`: layout
}
object `341` {
  
  inline def apply(): `341` = {
    val __obj = js.Dynamic.literal(name = "layout-05")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`341`]
  }
  
  extension [Self <: `341`](x: Self) {
    
    inline def setName(value: `layout-05`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
