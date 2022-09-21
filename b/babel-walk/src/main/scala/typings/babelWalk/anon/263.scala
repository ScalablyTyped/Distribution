package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNamedTupleMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `263`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNamedTupleMember, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNamedTupleMember, TState]] = js.undefined
}
object `263` {
  
  inline def apply[TState](): `263`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`263`[TState]]
  }
  
  extension [Self <: `263`[?], TState](x: Self & `263`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSNamedTupleMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNamedTupleMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
