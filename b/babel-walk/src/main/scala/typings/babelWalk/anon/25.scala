package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TryStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TryStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TryStatement, TState]] = js.undefined
}
object `25` {
  
  inline def apply[TState](): `25`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`[TState]]
  }
  
  extension [Self <: `25`[?], TState](x: Self & `25`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TryStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TryStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
