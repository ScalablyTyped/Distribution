package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSIndexedAccessType
import typings.babelWalk.libMod.AncestorFunction
import typings.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `332`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSIndexedAccessType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSIndexedAccessType, TState]] = js.undefined
}
object `332` {
  
  inline def apply[TState](): `332`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`332`[TState]]
  }
  
  extension [Self <: `332`[?], TState](x: Self & `332`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSIndexedAccessType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSIndexedAccessType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
