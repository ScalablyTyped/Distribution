package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`icon-03`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `288` extends StObject {
  
  var name: `icon-03`
  
  var `type`: color
}
object `288` {
  
  inline def apply(): `288` = {
    val __obj = js.Dynamic.literal(name = "icon-03")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`288`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `288`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `icon-03`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
