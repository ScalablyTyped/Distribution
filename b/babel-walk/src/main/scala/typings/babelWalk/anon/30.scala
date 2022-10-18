package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.OptionalMemberExpression
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[OptionalMemberExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[OptionalMemberExpression, TState]] = js.undefined
}
object `30` {
  
  inline def apply[TState](): `30`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`30`[TState]]
  }
  
  extension [Self <: `30`[?], TState](x: Self & `30`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[OptionalMemberExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[OptionalMemberExpression], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
