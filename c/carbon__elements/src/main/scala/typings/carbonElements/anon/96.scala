package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-strong-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var name: `border-strong-01`
  
  var `type`: color
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal(name = "border-strong-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `96`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-strong-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
