package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-03`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `249` extends StObject {
  
  var name: `spacing-03`
  
  var `type`: layout
}
object `249` {
  
  inline def apply(): `249` = {
    val __obj = js.Dynamic.literal(name = "spacing-03")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`249`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `249`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `spacing-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
