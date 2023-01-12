package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  var name: `layer-accent`
  
  var `type`: color
}
object `150` {
  
  inline def apply(): `150` = {
    val __obj = js.Dynamic.literal(name = "layer-accent")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`150`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `150`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-accent`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
