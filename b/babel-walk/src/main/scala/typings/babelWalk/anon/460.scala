package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DebuggerStatement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `460`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DebuggerStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DebuggerStatement, TState]] = js.undefined
}
object `460` {
  
  inline def apply[TState](): `460`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`460`[TState]]
  }
  
  extension [Self <: `460`[?], TState](x: Self & `460`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DebuggerStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DebuggerStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
