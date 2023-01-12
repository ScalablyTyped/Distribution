package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-inverse`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var name: `icon-inverse`
  
  var `type`: color
}
object `121` {
  
  inline def apply(): `121` = {
    val __obj = js.Dynamic.literal(name = "icon-inverse")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `icon-inverse`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
