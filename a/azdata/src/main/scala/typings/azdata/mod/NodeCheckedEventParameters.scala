package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCheckedEventParameters[T] extends StObject {
  
  var checked: Boolean
  
  var element: T
}
object NodeCheckedEventParameters {
  
  inline def apply[T](checked: Boolean, element: T): NodeCheckedEventParameters[T] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckedEventParameters[T]]
  }
  
  extension [Self <: NodeCheckedEventParameters[?], T](x: Self & NodeCheckedEventParameters[T]) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
