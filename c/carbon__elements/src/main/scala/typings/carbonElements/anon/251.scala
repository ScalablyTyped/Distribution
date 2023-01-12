package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-05`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `251` extends StObject {
  
  var name: `spacing-05`
  
  var `type`: layout
}
object `251` {
  
  inline def apply(): `251` = {
    val __obj = js.Dynamic.literal(name = "spacing-05")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`251`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `251`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `spacing-05`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
