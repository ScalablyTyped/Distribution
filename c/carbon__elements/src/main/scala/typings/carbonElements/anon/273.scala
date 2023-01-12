package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`interactive-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `273` extends StObject {
  
  var name: `interactive-03`
  
  var `type`: color
}
object `273` {
  
  inline def apply(): `273` = {
    val __obj = js.Dynamic.literal(name = "interactive-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`273`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `273`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `interactive-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
