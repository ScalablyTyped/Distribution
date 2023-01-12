package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`body-short-01`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var name: `body-short-01`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `219` {
  
  inline def apply(): `219` = {
    val __obj = js.Dynamic.literal(name = "body-short-01")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`219`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `219`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `body-short-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
