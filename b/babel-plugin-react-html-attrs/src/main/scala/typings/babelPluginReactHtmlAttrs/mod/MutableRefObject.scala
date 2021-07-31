package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableRefObject[T] extends StObject {
  
  var current: T
}
object MutableRefObject {
  
  @scala.inline
  def apply[T](current: T): MutableRefObject[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableRefObject[T]]
  }
  
  @scala.inline
  implicit class MutableRefObjectMutableBuilder[Self <: MutableRefObject[?], T] (val x: Self & MutableRefObject[T]) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
