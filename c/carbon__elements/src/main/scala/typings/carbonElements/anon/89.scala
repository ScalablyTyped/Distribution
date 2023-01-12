package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`border-subtle-01`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var name: `border-subtle-01`
  
  var `type`: color
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal(name = "border-subtle-01")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `89`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `border-subtle-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
