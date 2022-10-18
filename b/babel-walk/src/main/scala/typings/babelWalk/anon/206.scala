package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Function
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Function, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Function, TState]] = js.undefined
}
object `206` {
  
  inline def apply[TState](): `206`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`206`[TState]]
  }
  
  extension [Self <: `206`[?], TState](x: Self & `206`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Function], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Function], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
