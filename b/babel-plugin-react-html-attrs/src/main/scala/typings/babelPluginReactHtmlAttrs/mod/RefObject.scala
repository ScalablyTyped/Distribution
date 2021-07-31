package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefObject[T] extends StObject {
  
  val current: T | Null
}
object RefObject {
  
  @scala.inline
  def apply[T](): RefObject[T] = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[RefObject[T]]
  }
  
  @scala.inline
  implicit class RefObjectMutableBuilder[Self <: RefObject[?], T] (val x: Self & RefObject[T]) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
