package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `287` extends StObject {
  
  var name: `icon-02`
  
  var `type`: color
}
object `287` {
  
  inline def apply(): `287` = {
    val __obj = js.Dynamic.literal(name = "icon-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`287`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `287`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `icon-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
