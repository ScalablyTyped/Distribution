package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DecimalLiteral
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `543`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DecimalLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DecimalLiteral, TState]] = js.undefined
}
object `543` {
  
  inline def apply[TState](): `543`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`543`[TState]]
  }
  
  extension [Self <: `543`[?], TState](x: Self & `543`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DecimalLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DecimalLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
