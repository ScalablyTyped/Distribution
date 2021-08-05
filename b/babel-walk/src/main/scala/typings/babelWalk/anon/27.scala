package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.RestElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
}
object `27` {
  
  inline def apply[TState](): `27`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`27`[TState]]
  }
  
  extension [Self <: `27`[?], TState](x: Self & `27`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[RestElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
