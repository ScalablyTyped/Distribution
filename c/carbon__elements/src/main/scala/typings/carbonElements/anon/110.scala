package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-on-color-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var name: `text-on-color-disabled`
  
  var `type`: color
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal(name = "text-on-color-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `110`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-on-color-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
