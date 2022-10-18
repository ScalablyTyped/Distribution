package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BinaryExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `397`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.undefined
}
object `397` {
  
  inline def apply[TState](): `397`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`397`[TState]]
  }
  
  extension [Self <: `397`[?], TState](x: Self & `397`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
