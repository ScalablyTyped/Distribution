package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`button-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  var name: `button-primary`
  
  var `type`: color
}
object `159` {
  
  inline def apply(): `159` = {
    val __obj = js.Dynamic.literal(name = "button-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`159`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `159`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `button-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
