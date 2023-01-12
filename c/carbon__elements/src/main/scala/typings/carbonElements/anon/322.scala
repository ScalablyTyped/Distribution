package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`active-danger`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `322` extends StObject {
  
  var name: `active-danger`
  
  var `type`: color
}
object `322` {
  
  inline def apply(): `322` = {
    val __obj = js.Dynamic.literal(name = "active-danger")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`322`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `322`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `active-danger`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
