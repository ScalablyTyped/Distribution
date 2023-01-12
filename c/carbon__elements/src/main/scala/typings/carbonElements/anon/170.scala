package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-secondary-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  var name: `button-secondary-hover`
  
  var `type`: color
}
object `170` {
  
  inline def apply(): `170` = {
    val __obj = js.Dynamic.literal(name = "button-secondary-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `170`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-secondary-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
