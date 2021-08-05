package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSAsExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSAsExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSAsExpression, TState]] = js.undefined
}
object `6` {
  
  inline def apply[TState](): `6`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[TState]]
  }
  
  extension [Self <: `6`[?], TState](x: Self & `6`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSAsExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSAsExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
