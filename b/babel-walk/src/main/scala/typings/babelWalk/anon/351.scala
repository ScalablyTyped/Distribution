package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.OptionalCallExpression
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `351`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[OptionalCallExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[OptionalCallExpression, TState]] = js.undefined
}
object `351` {
  
  inline def apply[TState](): `351`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`351`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `351`[?], TState] (val x: Self & `351`[TState]) extends AnyVal {
    
    inline def setEnter(
      value: (/* node */ NodeType[OptionalCallExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[OptionalCallExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
