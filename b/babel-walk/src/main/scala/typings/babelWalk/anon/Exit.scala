package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSArrayType
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.undefined
}
object Exit {
  
  inline def apply[TState](): Exit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exit[?], TState] (val x: Self & Exit[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
