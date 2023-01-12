package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`support-error-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var name: `support-error-inverse`
  
  var `type`: color
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal(name = "support-error-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `support-error-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
