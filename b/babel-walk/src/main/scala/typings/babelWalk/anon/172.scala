package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Literal
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Literal, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Literal, TState]] = js.undefined
}
object `172` {
  
  inline def apply[TState](): `172`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`172`[TState]]
  }
  
  extension [Self <: `172`[?], TState](x: Self & `172`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Literal], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Literal], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
