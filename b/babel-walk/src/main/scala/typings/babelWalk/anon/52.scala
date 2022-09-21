package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.OptionalCallExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[OptionalCallExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[OptionalCallExpression, TState]] = js.undefined
}
object `52` {
  
  inline def apply[TState](): `52`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`52`[TState]]
  }
  
  extension [Self <: `52`[?], TState](x: Self & `52`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[OptionalCallExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OptionalCallExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
