package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `154` extends StObject {
  
  var name: `field-hover`
  
  var `type`: color
}
object `154` {
  
  inline def apply(): `154` = {
    val __obj = js.Dynamic.literal(name = "field-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `154`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `field-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
