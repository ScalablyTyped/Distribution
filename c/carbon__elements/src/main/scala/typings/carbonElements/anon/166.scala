package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-secondary-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var name: `button-secondary-active`
  
  var `type`: color
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal(name = "button-secondary-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-secondary-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
