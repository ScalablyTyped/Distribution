package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSInferType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInferType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInferType, TState]] = js.undefined
}
object `117` {
  
  inline def apply[TState](): `117`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`117`[TState]]
  }
  
  extension [Self <: `117`[?], TState](x: Self & `117`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInferType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInferType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
