package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`field-hover-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  var name: `field-hover-02`
  
  var `type`: color
}
object `84` {
  
  inline def apply(): `84` = {
    val __obj = js.Dynamic.literal(name = "field-hover-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`84`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `84`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `field-hover-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
