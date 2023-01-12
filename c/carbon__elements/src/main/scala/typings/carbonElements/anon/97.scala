package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-strong-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var name: `border-strong-02`
  
  var `type`: color
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal(name = "border-strong-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `97`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-strong-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
