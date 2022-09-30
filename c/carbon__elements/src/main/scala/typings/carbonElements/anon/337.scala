package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-01`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `337` extends StObject {
  
  var name: `layout-01`
  
  var `type`: layout
}
object `337` {
  
  inline def apply(): `337` = {
    val __obj = js.Dynamic.literal(name = "layout-01")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`337`]
  }
  
  extension [Self <: `337`](x: Self) {
    
    inline def setName(value: `layout-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
