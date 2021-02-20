package typings.baseui.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[T] extends StObject {
  
  var children: js.UndefOr[js.Function1[/* args */ T, ReactNode]] = js.native
}
object Children {
  
  @scala.inline
  def apply[T](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children[_], T] (val x: Self with Children[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* args */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
