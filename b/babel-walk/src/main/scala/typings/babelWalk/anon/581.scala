package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.FlowDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[FlowDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[FlowDeclaration, TState]] = js.undefined
}
object `581` {
  
  inline def apply[TState](): `581`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`581`[TState]]
  }
  
  extension [Self <: `581`[?], TState](x: Self & `581`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
