package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`expressive-heading-06`
import typings.carbonElements.carbonElementsStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239` extends StObject {
  
  var name: `expressive-heading-06`
  
  var `type`: typings.carbonElements.carbonElementsStrings.`type`
}
object `239` {
  
  inline def apply(): `239` = {
    val __obj = js.Dynamic.literal(name = "expressive-heading-06")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[`239`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `239`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `expressive-heading-06`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
