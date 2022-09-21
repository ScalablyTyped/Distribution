package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.WithStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `405`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[WithStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[WithStatement, TState]] = js.undefined
}
object `405` {
  
  inline def apply[TState](): `405`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`405`[TState]]
  }
  
  extension [Self <: `405`[?], TState](x: Self & `405`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[WithStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[WithStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
