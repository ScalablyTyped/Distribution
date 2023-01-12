package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-02`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var name: `border-subtle-02`
  
  var `type`: color
}
object `92` {
  
  inline def apply(): `92` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-02")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`92`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `92`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-subtle-02`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
