package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`inverse-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `293` extends StObject {
  
  var name: `inverse-02`
  
  var `type`: color
}
object `293` {
  
  inline def apply(): `293` = {
    val __obj = js.Dynamic.literal(name = "inverse-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`293`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `293`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `inverse-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
