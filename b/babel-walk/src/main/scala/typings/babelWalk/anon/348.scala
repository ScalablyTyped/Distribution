package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ArrayExpression
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `348`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ArrayExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ArrayExpression, TState]] = js.undefined
}
object `348` {
  
  inline def apply[TState](): `348`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`348`[TState]]
  }
  
  extension [Self <: `348`[?], TState](x: Self & `348`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ArrayExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ArrayExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
