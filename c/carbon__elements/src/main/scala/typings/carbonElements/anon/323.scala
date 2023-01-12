package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`hover-row`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `323` extends StObject {
  
  var name: `hover-row`
  
  var `type`: color
}
object `323` {
  
  inline def apply(): `323` = {
    val __obj = js.Dynamic.literal(name = "hover-row")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`323`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `323`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `hover-row`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
