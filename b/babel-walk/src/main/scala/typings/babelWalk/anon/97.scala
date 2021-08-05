package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForXStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.undefined
}
object `97` {
  
  inline def apply[TState](): `97`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`[TState]]
  }
  
  extension [Self <: `97`[?], TState](x: Self & `97`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
