package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ContinueStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ContinueStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ContinueStatement, TState]] = js.undefined
}
object `45` {
  
  inline def apply[TState](): `45`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`[TState]]
  }
  
  extension [Self <: `45`[?], TState](x: Self & `45`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ContinueStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ContinueStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
