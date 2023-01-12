package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`productive-heading-03`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `229` extends StObject {
  
  var name: `productive-heading-03`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `229` {
  
  inline def apply(): `229` = {
    val __obj = js.Dynamic.literal(name = "productive-heading-03")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`229`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `229`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `productive-heading-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
