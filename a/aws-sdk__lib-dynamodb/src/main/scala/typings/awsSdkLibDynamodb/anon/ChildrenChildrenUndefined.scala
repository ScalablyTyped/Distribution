package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenChildrenUndefined extends StObject {
  
  var children: ChildrenUndefined
  
  var key: String
}
object ChildrenChildrenUndefined {
  
  inline def apply(children: ChildrenUndefined, key: String): ChildrenChildrenUndefined = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenChildrenUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenChildrenUndefined] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ChildrenUndefined): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
