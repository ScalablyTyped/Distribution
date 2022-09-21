package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSType
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `387`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSType, TState]] = js.undefined
}
object `387` {
  
  inline def apply[TState](): `387`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`387`[TState]]
  }
  
  extension [Self <: `387`[?], TState](x: Self & `387`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
