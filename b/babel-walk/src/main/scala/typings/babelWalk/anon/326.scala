package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Pattern
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `326`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Pattern, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Pattern, TState]] = js.undefined
}
object `326` {
  
  inline def apply[TState](): `326`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`326`[TState]]
  }
  
  extension [Self <: `326`[?], TState](x: Self & `326`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Pattern], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Pattern], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
