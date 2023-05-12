package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.FunctionParent
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `532`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[FunctionParent, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[FunctionParent, TState]] = js.undefined
}
object `532` {
  
  inline def apply[TState](): `532`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`532`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `532`[?], TState] (val x: Self & `532`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionParent], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionParent], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
