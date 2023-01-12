package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var name: `icon-primary`
  
  var `type`: color
}
object `119` {
  
  inline def apply(): `119` = {
    val __obj = js.Dynamic.literal(name = "icon-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `119`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `icon-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
