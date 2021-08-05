package typings.baseui.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[T] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* args */ T, ReactNode]] = js.undefined
}
object Children {
  
  inline def apply[T](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  extension [Self <: Children[?], T](x: Self & Children[T]) {
    
    inline def setChildren(value: /* args */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
