package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-hover`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var name: `layer-accent-hover`
  
  var `type`: color
}
object `151` {
  
  inline def apply(): `151` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-hover")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `151`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-accent-hover`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
