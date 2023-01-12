package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`label-02`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var name: `label-02`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `216` {
  
  inline def apply(): `216` = {
    val __obj = js.Dynamic.literal(name = "label-02")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `216`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `label-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
