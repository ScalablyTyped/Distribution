package typings.carbonElements.anon

import typings.carbonElements.carbonElementsStrings.`link-primary`
import typings.carbonElements.carbonElementsStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var name: `link-primary`
  
  var `type`: color
}
object `112` {
  
  inline def apply(): `112` = {
    val __obj = js.Dynamic.literal(name = "link-primary")
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `112`] (val x: Self) extends AnyVal {
    
    inline def setName(value: `link-primary`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
