package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenName extends StObject {
  
  var children: js.UndefOr[js.Array[ReturnType[FnCall | Fn0]]] = js.undefined
  
  var name: String
}
object ChildrenName {
  
  inline def apply(name: String): ChildrenName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenName] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ReturnType[FnCall | Fn0]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (ReturnType[FnCall | Fn0])*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
