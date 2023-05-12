package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenKey extends StObject {
  
  var children: ChildrenArray
  
  var key: String
}
object ChildrenKey {
  
  inline def apply(children: ChildrenArray, key: String): ChildrenKey = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenKey] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ChildrenArray): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
