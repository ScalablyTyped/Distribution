package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-00`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var name: `border-subtle-00`
  
  var `type`: color
}
object `88` {
  
  inline def apply(): `88` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-00")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`88`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `88`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-subtle-00`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
