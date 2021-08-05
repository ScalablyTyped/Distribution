package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ThrowStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ThrowStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ThrowStatement, TState]] = js.undefined
}
object `160` {
  
  inline def apply[TState](): `160`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`160`[TState]]
  }
  
  extension [Self <: `160`[?], TState](x: Self & `160`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ThrowStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ThrowStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
