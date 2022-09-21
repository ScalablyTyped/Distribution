package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSModuleBlock
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `569`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSModuleBlock, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSModuleBlock, TState]] = js.undefined
}
object `569` {
  
  inline def apply[TState](): `569`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`569`[TState]]
  }
  
  extension [Self <: `569`[?], TState](x: Self & `569`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSModuleBlock], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSModuleBlock], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
