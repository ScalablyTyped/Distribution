package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layout-04`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `340` extends StObject {
  
  var name: `layout-04`
  
  var `type`: layout
}
object `340` {
  
  inline def apply(): `340` = {
    val __obj = js.Dynamic.literal(name = "layout-04")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`340`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `340`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layout-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
