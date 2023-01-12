package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`fluid-spacing-02`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `261` extends StObject {
  
  var name: `fluid-spacing-02`
  
  var `type`: layout
}
object `261` {
  
  inline def apply(): `261` = {
    val __obj = js.Dynamic.literal(name = "fluid-spacing-02")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`261`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `261`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `fluid-spacing-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
