package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-04`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  var name: `spacing-04`
  
  var `type`: layout
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal(name = "spacing-04")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`250`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `250`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `spacing-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
