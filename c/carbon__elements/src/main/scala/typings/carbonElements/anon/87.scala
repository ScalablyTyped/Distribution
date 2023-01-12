package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.color
import typings.carbonElements.carbonElementsStrings.interactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  var name: interactive
  
  var `type`: color
}
object `87` {
  
  inline def apply(): `87` = {
    val __obj = js.Dynamic.literal(name = "interactive")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`] (val x: Self) extends AnyVal {
    
    inline def setName(value: interactive): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
