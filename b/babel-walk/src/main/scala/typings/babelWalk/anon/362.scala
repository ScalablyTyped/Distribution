package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.VariableDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `362`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[VariableDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[VariableDeclaration, TState]] = js.undefined
}
object `362` {
  
  inline def apply[TState](): `362`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`362`[TState]]
  }
  
  extension [Self <: `362`[?], TState](x: Self & `362`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VariableDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VariableDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
