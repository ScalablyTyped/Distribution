package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.AwaitExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `425`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[AwaitExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[AwaitExpression, TState]] = js.undefined
}
object `425` {
  
  inline def apply[TState](): `425`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`425`[TState]]
  }
  
  extension [Self <: `425`[?], TState](x: Self & `425`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[AwaitExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[AwaitExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
