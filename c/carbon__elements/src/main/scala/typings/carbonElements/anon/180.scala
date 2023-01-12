package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  var name: `notification-action-tertiary-inverse-hover`
  
  var `type`: color
}
object `180` {
  
  inline def apply(): `180` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `180`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `notification-action-tertiary-inverse-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
