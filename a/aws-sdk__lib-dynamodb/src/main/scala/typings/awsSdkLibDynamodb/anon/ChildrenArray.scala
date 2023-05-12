package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenArray extends StObject {
  
  var children: js.Array[Key]
}
object ChildrenArray {
  
  inline def apply(children: js.Array[Key]): ChildrenArray = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenArray] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[Key]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Key*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
