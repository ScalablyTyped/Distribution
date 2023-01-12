package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`code-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var name: `code-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `223` {
  
  inline def apply(): `223` = {
    val __obj = js.Dynamic.literal(name = "code-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`223`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `223`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `code-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
