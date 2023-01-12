package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-error`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  var name: `text-error`
  
  var `type`: color
}
object `107` {
  
  inline def apply(): `107` = {
    val __obj = js.Dynamic.literal(name = "text-error")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `107`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-error`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
