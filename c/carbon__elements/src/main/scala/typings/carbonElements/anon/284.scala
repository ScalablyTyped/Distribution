package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`text-04`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `284` extends StObject {
  
  var name: `text-04`
  
  var `type`: color
}
object `284` {
  
  inline def apply(): `284` = {
    val __obj = js.Dynamic.literal(name = "text-04")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`284`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `284`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `text-04`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
