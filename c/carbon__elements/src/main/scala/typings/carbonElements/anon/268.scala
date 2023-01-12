package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`container-05`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `268` extends StObject {
  
  var name: `container-05`
  
  var `type`: layout
}
object `268` {
  
  inline def apply(): `268` = {
    val __obj = js.Dynamic.literal(name = "container-05")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`268`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `268`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `container-05`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
