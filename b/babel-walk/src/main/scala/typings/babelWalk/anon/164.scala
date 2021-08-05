package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DirectiveLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DirectiveLiteral, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DirectiveLiteral, TState]] = js.undefined
}
object `164` {
  
  inline def apply[TState](): `164`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`164`[TState]]
  }
  
  extension [Self <: `164`[?], TState](x: Self & `164`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DirectiveLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DirectiveLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
