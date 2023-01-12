package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`layer-active`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var name: `layer-active`
  
  var `type`: color
}
object `146` {
  
  inline def apply(): `146` = {
    val __obj = js.Dynamic.literal(name = "layer-active")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `146`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `layer-active`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
