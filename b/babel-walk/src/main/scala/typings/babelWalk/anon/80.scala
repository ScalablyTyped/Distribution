package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.LogicalExpression
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[LogicalExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[LogicalExpression, TState]] = js.undefined
}
object `80` {
  
  inline def apply[TState](): `80`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`80`[TState]]
  }
  
  extension [Self <: `80`[?], TState](x: Self & `80`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[LogicalExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[LogicalExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
