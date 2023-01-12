package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var name: `layer-selected-02`
  
  var `type`: color
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-selected-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
