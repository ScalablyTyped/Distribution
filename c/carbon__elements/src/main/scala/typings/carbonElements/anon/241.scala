package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`quotation-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var name: `quotation-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `241` {
  
  inline def apply(): `241` = {
    val __obj = js.Dynamic.literal(name = "quotation-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`241`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `241`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `quotation-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
