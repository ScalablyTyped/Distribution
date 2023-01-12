package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-selected-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  var name: `layer-selected-disabled`
  
  var `type`: color
}
object `69` {
  
  inline def apply(): `69` = {
    val __obj = js.Dynamic.literal(name = "layer-selected-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `69`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-selected-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
