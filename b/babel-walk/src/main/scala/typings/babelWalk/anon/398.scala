package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InterpreterDirective
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `398`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InterpreterDirective, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InterpreterDirective, TState]] = js.undefined
}
object `398` {
  
  inline def apply[TState](): `398`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`398`[TState]]
  }
  
  extension [Self <: `398`[?], TState](x: Self & `398`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InterpreterDirective], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InterpreterDirective], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
