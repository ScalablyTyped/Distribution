package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var name: `border-subtle`
  
  var `type`: color
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal(name = "border-subtle")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `155`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-subtle`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
