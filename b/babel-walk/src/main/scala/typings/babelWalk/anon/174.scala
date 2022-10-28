package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ArrowFunctionExpression
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ArrowFunctionExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ArrowFunctionExpression, TState]] = js.undefined
}
object `174` {
  
  inline def apply[TState](): `174`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`174`[TState]]
  }
  
  extension [Self <: `174`[?], TState](x: Self & `174`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[ArrowFunctionExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[ArrowFunctionExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
