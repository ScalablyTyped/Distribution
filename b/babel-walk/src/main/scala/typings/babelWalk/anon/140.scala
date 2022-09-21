package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Method
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Method, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Method, TState]] = js.undefined
}
object `140` {
  
  inline def apply[TState](): `140`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`140`[TState]]
  }
  
  extension [Self <: `140`[?], TState](x: Self & `140`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
