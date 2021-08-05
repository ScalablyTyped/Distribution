package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowBaseAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowBaseAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowBaseAnnotation, TState]] = js.undefined
}
object `155` {
  
  inline def apply[TState](): `155`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`155`[TState]]
  }
  
  extension [Self <: `155`[?], TState](x: Self & `155`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowBaseAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowBaseAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
