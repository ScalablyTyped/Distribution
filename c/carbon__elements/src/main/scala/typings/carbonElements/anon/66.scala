package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var name: `layer-selected-03`
  
  var `type`: color
}
object `66` {
  
  inline def apply(): `66` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `66`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-selected-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
