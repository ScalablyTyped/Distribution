package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ArrayPattern
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ArrayPattern, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ArrayPattern, TState]] = js.undefined
}
object `130` {
  
  inline def apply[TState](): `130`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`130`[TState]]
  }
  
  extension [Self <: `130`[?], TState](x: Self & `130`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ArrayPattern], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ArrayPattern], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
