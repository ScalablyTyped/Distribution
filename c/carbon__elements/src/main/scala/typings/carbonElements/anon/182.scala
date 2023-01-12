package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`notification-action-tertiary-inverse-text-on-color-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  var name: `notification-action-tertiary-inverse-text-on-color-disabled`
  
  var `type`: color
}
object `182` {
  
  inline def apply(): `182` = {
    val __obj = js.Dynamic.literal(name = "notification-action-tertiary-inverse-text-on-color-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `182`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `notification-action-tertiary-inverse-text-on-color-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
