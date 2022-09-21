package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSSymbolKeyword
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `444`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSSymbolKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSSymbolKeyword, TState]] = js.undefined
}
object `444` {
  
  inline def apply[TState](): `444`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`444`[TState]]
  }
  
  extension [Self <: `444`[?], TState](x: Self & `444`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSSymbolKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSSymbolKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
