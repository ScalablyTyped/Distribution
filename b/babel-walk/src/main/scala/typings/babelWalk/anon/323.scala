package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.SpreadElement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `323`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[SpreadElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[SpreadElement, TState]] = js.undefined
}
object `323` {
  
  inline def apply[TState](): `323`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`323`[TState]]
  }
  
  extension [Self <: `323`[?], TState](x: Self & `323`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[SpreadElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[SpreadElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
