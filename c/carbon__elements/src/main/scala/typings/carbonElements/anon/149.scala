package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var name: `layer-selected-hover`
  
  var `type`: color
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`149`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `149`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-selected-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
