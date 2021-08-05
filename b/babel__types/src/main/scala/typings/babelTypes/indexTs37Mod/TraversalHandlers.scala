package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraversalHandlers[T] extends StObject {
  
  var enter: js.UndefOr[TraversalHandler[T]] = js.undefined
  
  var exit: js.UndefOr[TraversalHandler[T]] = js.undefined
}
object TraversalHandlers {
  
  inline def apply[T](): TraversalHandlers[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalHandlers[T]]
  }
  
  extension [Self <: TraversalHandlers[?], T](x: Self & TraversalHandlers[T]) {
    
    inline def setEnter(value: TraversalHandler[T]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: TraversalHandler[T]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
