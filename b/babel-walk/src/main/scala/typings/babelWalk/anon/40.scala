package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Noop
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Noop, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Noop, TState]] = js.undefined
}
object `40` {
  
  inline def apply[TState](): `40`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`[TState]]
  }
  
  extension [Self <: `40`[?], TState](x: Self & `40`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Noop], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Noop], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
