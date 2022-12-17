package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSSymbolKeyword
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSSymbolKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSSymbolKeyword, TState]] = js.undefined
}
object `148` {
  
  inline def apply[TState](): `148`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`148`[TState]]
  }
  
  extension [Self <: `148`[?], TState](x: Self & `148`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSSymbolKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSSymbolKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
