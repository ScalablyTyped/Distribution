package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Block
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `527`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Block, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Block, TState]] = js.undefined
}
object `527` {
  
  inline def apply[TState](): `527`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`527`[TState]]
  }
  
  extension [Self <: `527`[?], TState](x: Self & `527`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Block], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
