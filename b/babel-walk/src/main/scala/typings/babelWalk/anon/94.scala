package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Decorator
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Decorator, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Decorator, TState]] = js.undefined
}
object `94` {
  
  inline def apply[TState](): `94`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`94`[TState]]
  }
  
  extension [Self <: `94`[?], TState](x: Self & `94`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Decorator], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Decorator], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
