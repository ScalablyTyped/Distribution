package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.RestElement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `325`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
}
object `325` {
  
  inline def apply[TState](): `325`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`325`[TState]]
  }
  
  extension [Self <: `325`[?], TState](x: Self & `325`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
