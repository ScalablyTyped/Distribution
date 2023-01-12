package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-accent-active-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  var name: `layer-accent-active-03`
  
  var `type`: color
}
object `78` {
  
  inline def apply(): `78` = {
    val __obj = js.Dynamic.literal(name = "layer-accent-active-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `78`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-accent-active-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
