package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  var selected: js.Array[Any]
}
object Selected {
  
  inline def apply(selected: js.Array[Any]): Selected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
    
    inline def setSelected(value: js.Array[Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: Any*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
