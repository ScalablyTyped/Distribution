package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Noop
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Noop, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Noop, TState]] = js.undefined
}
object `38` {
  
  inline def apply[TState](): `38`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`38`[TState]]
  }
  
  extension [Self <: `38`[?], TState](x: Self & `38`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Noop], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Noop], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
