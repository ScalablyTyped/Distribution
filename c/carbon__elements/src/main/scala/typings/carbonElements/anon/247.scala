package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-01`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247` extends StObject {
  
  var name: `spacing-01`
  
  var `type`: layout
}
object `247` {
  
  inline def apply(): `247` = {
    val __obj = js.Dynamic.literal(name = "spacing-01")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`247`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `247`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `spacing-01`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
