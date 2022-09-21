package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowType, TState]] = js.undefined
}
object `41` {
  
  inline def apply[TState](): `41`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`41`[TState]]
  }
  
  extension [Self <: `41`[?], TState](x: Self & `41`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
