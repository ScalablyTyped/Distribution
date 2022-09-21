package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ModuleExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ModuleExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ModuleExpression, TState]] = js.undefined
}
object `174` {
  
  inline def apply[TState](): `174`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`174`[TState]]
  }
  
  extension [Self <: `174`[?], TState](x: Self & `174`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ModuleExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ModuleExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
