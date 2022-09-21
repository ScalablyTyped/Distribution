package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `296`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Loop, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Loop, TState]] = js.undefined
}
object `296` {
  
  inline def apply[TState](): `296`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`296`[TState]]
  }
  
  extension [Self <: `296`[?], TState](x: Self & `296`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
