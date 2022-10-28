package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.RestElement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
}
object `327` {
  
  inline def apply[TState](): `327`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`327`[TState]]
  }
  
  extension [Self <: `327`[?], TState](x: Self & `327`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
