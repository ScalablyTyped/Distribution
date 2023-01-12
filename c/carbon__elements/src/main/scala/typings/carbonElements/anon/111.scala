package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-disabled`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var name: `text-disabled`
  
  var `type`: color
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal(name = "text-disabled")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `111`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-disabled`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
