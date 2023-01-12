package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-size-02`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `270` extends StObject {
  
  var name: `icon-size-02`
  
  var `type`: layout
}
object `270` {
  
  inline def apply(): `270` = {
    val __obj = js.Dynamic.literal(name = "icon-size-02")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`270`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `270`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `icon-size-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
