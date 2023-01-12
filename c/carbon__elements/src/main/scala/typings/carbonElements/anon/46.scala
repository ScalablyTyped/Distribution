package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`background-selected-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var name: `background-selected-hover`
  
  var `type`: color
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal(name = "background-selected-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `46`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `background-selected-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
