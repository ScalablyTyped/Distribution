package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`productive-heading-07`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var name: `productive-heading-07`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `233` {
  
  inline def apply(): `233` = {
    val __obj = js.Dynamic.literal(name = "productive-heading-07")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `233`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `productive-heading-07`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
