package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.StringLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[StringLiteral, TState]] = js.undefined
}
object `148` {
  
  inline def apply[TState](): `148`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`148`[TState]]
  }
  
  extension [Self <: `148`[?], TState](x: Self & `148`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[StringLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
