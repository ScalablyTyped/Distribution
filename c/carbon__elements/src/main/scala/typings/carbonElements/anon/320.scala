package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`inverse-hover-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `320` extends StObject {
  
  var name: `inverse-hover-ui`
  
  var `type`: color
}
object `320` {
  
  inline def apply(): `320` = {
    val __obj = js.Dynamic.literal(name = "inverse-hover-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`320`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `320`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `inverse-hover-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
