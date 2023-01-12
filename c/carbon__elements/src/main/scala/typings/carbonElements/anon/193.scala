package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`tag-color-blue`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var name: `tag-color-blue`
  
  var `type`: color
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal(name = "tag-color-blue")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `193`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `tag-color-blue`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
