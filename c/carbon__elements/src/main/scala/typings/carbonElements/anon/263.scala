package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`fluid-spacing-04`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `263` extends StObject {
  
  var name: `fluid-spacing-04`
  
  var `type`: layout
}
object `263` {
  
  inline def apply(): `263` = {
    val __obj = js.Dynamic.literal(name = "fluid-spacing-04")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`263`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `263`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `fluid-spacing-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
