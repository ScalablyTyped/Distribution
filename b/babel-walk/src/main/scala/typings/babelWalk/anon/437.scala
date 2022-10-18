package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Method
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `437`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Method, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Method, TState]] = js.undefined
}
object `437` {
  
  inline def apply[TState](): `437`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`437`[TState]]
  }
  
  extension [Self <: `437`[?], TState](x: Self & `437`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Method], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
