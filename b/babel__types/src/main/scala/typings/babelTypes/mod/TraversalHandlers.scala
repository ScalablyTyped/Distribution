package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraversalHandlers[T] extends StObject {
  
  var enter: js.UndefOr[TraversalHandler[T]] = js.native
  
  var exit: js.UndefOr[TraversalHandler[T]] = js.native
}
object TraversalHandlers {
  
  @scala.inline
  def apply[T](): TraversalHandlers[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalHandlers[T]]
  }
  
  @scala.inline
  implicit class TraversalHandlersMutableBuilder[Self <: TraversalHandlers[_], T] (val x: Self with TraversalHandlers[T]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: TraversalHandler[T]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: TraversalHandler[T]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
