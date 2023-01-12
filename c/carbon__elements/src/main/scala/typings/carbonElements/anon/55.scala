package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var name: `layer-selected-01`
  
  var `type`: color
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-selected-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
