package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenUndefined extends StObject {
  
  var children: Unit
}
object ChildrenUndefined {
  
  inline def apply(children: Unit): ChildrenUndefined = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenUndefined] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
