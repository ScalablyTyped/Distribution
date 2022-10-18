package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Private
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `542`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Private, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Private, TState]] = js.undefined
}
object `542` {
  
  inline def apply[TState](): `542`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`542`[TState]]
  }
  
  extension [Self <: `542`[?], TState](x: Self & `542`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Private], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Private], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
