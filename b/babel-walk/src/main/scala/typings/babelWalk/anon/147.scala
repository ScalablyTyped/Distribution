package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSSymbolKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSSymbolKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSSymbolKeyword, TState]] = js.undefined
}
object `147` {
  
  inline def apply[TState](): `147`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`147`[TState]]
  }
  
  extension [Self <: `147`[?], TState](x: Self & `147`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSSymbolKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSSymbolKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
