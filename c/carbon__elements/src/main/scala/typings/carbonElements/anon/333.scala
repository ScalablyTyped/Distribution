package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`brand-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `333` extends StObject {
  
  var name: `brand-03`
  
  var `type`: color
}
object `333` {
  
  inline def apply(): `333` = {
    val __obj = js.Dynamic.literal(name = "brand-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`333`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `333`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `brand-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
