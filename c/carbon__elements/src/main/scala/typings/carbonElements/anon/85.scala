package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var name: `field-03`
  
  var `type`: color
}
object `85` {
  
  inline def apply(): `85` = {
    val __obj = js.Dynamic.literal(name = "field-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `85`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `field-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
