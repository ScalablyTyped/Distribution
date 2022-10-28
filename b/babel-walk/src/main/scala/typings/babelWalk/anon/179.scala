package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.JSXFragment
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXFragment, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[JSXFragment, TState]] = js.undefined
}
object `179` {
  
  inline def apply[TState](): `179`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`179`[TState]]
  }
  
  extension [Self <: `179`[?], TState](x: Self & `179`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXFragment], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXFragment], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
