package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menus extends StObject {
  
  var menus: js.Array[Any]
  
  var nestedMenuHoverIndex: Double
}
object Menus {
  
  inline def apply(menus: js.Array[Any], nestedMenuHoverIndex: Double): Menus = {
    val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any], nestedMenuHoverIndex = nestedMenuHoverIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menus] (val x: Self) extends AnyVal {
    
    inline def setMenus(value: js.Array[Any]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setMenusVarargs(value: Any*): Self = StObject.set(x, "menus", js.Array(value*))
    
    inline def setNestedMenuHoverIndex(value: Double): Self = StObject.set(x, "nestedMenuHoverIndex", value.asInstanceOf[js.Any])
  }
}
