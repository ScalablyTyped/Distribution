package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`expressive-paragraph-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var name: `expressive-paragraph-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `240` {
  
  inline def apply(): `240` = {
    val __obj = js.Dynamic.literal(name = "expressive-paragraph-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `240`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `expressive-paragraph-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
