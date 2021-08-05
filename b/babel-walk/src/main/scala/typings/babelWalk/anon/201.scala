package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Expression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Expression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Expression, TState]] = js.undefined
}
object `201` {
  
  inline def apply[TState](): `201`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`201`[TState]]
  }
  
  extension [Self <: `201`[?], TState](x: Self & `201`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Expression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Expression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
