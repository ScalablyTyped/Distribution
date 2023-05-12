package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenArrayKeyString extends StObject {
  
  var children: js.Array[Children]
  
  var key: String
}
object ChildrenArrayKeyString {
  
  inline def apply(children: js.Array[Children], key: String): ChildrenArrayKeyString = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArrayKeyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenArrayKeyString] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[Children]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Children*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
