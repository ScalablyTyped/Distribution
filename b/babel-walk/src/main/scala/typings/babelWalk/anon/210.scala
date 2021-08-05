package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BigIntLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BigIntLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BigIntLiteral, TState]] = js.undefined
}
object `210` {
  
  inline def apply[TState](): `210`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`210`[TState]]
  }
  
  extension [Self <: `210`[?], TState](x: Self & `210`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BigIntLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BigIntLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
