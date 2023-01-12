package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`quotation-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var name: `quotation-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `242` {
  
  inline def apply(): `242` = {
    val __obj = js.Dynamic.literal(name = "quotation-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`242`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `242`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `quotation-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
