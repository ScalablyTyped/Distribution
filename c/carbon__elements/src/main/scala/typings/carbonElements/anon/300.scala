package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`inverse-support-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `300` extends StObject {
  
  var name: `inverse-support-03`
  
  var `type`: color
}
object `300` {
  
  inline def apply(): `300` = {
    val __obj = js.Dynamic.literal(name = "inverse-support-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`300`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `300`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `inverse-support-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
