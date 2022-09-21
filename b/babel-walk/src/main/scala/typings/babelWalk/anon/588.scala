package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.NullLiteral
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `588`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[NullLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[NullLiteral, TState]] = js.undefined
}
object `588` {
  
  inline def apply[TState](): `588`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`588`[TState]]
  }
  
  extension [Self <: `588`[?], TState](x: Self & `588`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[NullLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[NullLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
