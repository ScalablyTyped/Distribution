package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Expression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `505`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Expression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Expression, TState]] = js.undefined
}
object `505` {
  
  inline def apply[TState](): `505`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`505`[TState]]
  }
  
  extension [Self <: `505`[?], TState](x: Self & `505`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Expression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Expression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
