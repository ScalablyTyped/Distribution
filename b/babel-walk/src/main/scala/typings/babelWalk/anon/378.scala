package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.VariableDeclaration
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `378`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[VariableDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[VariableDeclaration, TState]] = js.undefined
}
object `378` {
  
  inline def apply[TState](): `378`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`378`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `378`[?], TState] (val x: Self & `378`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[VariableDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VariableDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
