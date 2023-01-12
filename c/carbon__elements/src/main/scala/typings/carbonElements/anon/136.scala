package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.color
import typings.carbonElements.carbonElementsStrings.highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var name: highlight
  
  var `type`: color
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal(name = "highlight")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `136`] (val x: Self) extends AnyVal {
    
    inline def setName(value: highlight): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
