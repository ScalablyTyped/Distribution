package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ModuleExpression
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `475`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ModuleExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ModuleExpression, TState]] = js.undefined
}
object `475` {
  
  inline def apply[TState](): `475`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`475`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `475`[?], TState] (val x: Self & `475`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[ModuleExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ModuleExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
