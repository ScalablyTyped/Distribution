package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNonNullExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNonNullExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNonNullExpression, TState]] = js.undefined
}
object `109` {
  
  inline def apply[TState](): `109`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`109`[TState]]
  }
  
  extension [Self <: `109`[?], TState](x: Self & `109`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSNonNullExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNonNullExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
