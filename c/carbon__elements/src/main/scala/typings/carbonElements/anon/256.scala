package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`spacing-10`
import typings.carbonElements.carbonElementsStrings.layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var name: `spacing-10`
  
  var `type`: layout
}
object `256` {
  
  inline def apply(): `256` = {
    val __obj = js.Dynamic.literal(name = "spacing-10")
    __obj.updateDynamic("type")("layout")
    __obj.asInstanceOf[`256`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `256`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `spacing-10`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: layout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
