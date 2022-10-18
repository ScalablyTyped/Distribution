package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Directive
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Directive, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Directive, TState]] = js.undefined
}
object `369` {
  
  inline def apply[TState](): `369`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`369`[TState]]
  }
  
  extension [Self <: `369`[?], TState](x: Self & `369`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Directive], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Directive], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
