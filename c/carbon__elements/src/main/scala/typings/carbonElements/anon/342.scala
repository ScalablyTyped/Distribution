package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-06`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `342` extends StObject {
  
  var name: `layout-06`
  
  var `type`: layout
}
object `342` {
  
  inline def apply(): `342` = {
    val __obj = js.Dynamic.literal(name = "layout-06")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`342`]
  }
  
  extension [Self <: `342`](x: Self) {
    
    inline def setName(value: `layout-06`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
