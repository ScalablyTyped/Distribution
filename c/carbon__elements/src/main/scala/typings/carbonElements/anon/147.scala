package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var name: `layer-hover`
  
  var `type`: color
}
object `147` {
  
  inline def apply(): `147` = {
    val __obj = js.Dynamic.literal(name = "layer-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `147`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
