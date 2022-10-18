package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowBaseAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `457`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowBaseAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowBaseAnnotation, TState]] = js.undefined
}
object `457` {
  
  inline def apply[TState](): `457`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`457`[TState]]
  }
  
  extension [Self <: `457`[?], TState](x: Self & `457`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowBaseAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowBaseAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
