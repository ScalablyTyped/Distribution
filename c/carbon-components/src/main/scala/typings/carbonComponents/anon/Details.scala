package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var details: js.Object
  
  var hadContextMenu: Boolean
  
  var relatedTarget: typings.std.Element
  
  var `type`: String
}
object Details {
  
  inline def apply(details: js.Object, hadContextMenu: Boolean, relatedTarget: typings.std.Element, `type`: String): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], hadContextMenu = hadContextMenu.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setHadContextMenu(value: Boolean): Self = StObject.set(x, "hadContextMenu", value.asInstanceOf[js.Any])
    
    inline def setRelatedTarget(value: typings.std.Element): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
