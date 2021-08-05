package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BinaryExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.undefined
}
object `96` {
  
  inline def apply[TState](): `96`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`96`[TState]]
  }
  
  extension [Self <: `96`[?], TState](x: Self & `96`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
