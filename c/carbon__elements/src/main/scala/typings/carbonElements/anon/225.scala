package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`heading-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  var name: `heading-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `225` {
  
  inline def apply(): `225` = {
    val __obj = js.Dynamic.literal(name = "heading-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`225`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `225`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `heading-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
