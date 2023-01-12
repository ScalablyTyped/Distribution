package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`inverse-focus-ui`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305` extends StObject {
  
  var name: `inverse-focus-ui`
  
  var `type`: color
}
object `305` {
  
  inline def apply(): `305` = {
    val __obj = js.Dynamic.literal(name = "inverse-focus-ui")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`305`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `305`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `inverse-focus-ui`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
