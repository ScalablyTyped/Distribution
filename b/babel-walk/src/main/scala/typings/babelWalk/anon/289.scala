package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Immutable
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `289`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Immutable, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Immutable, TState]] = js.undefined
}
object `289` {
  
  inline def apply[TState](): `289`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`289`[TState]]
  }
  
  extension [Self <: `289`[?], TState](x: Self & `289`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Immutable], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Immutable], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
