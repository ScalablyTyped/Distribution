package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  var name: `button-disabled`
  
  var `type`: color
}
object `172` {
  
  inline def apply(): `172` = {
    val __obj = js.Dynamic.literal(name = "button-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `172`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
