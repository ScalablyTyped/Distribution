package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PipelineBareFunction
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PipelineBareFunction, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PipelineBareFunction, TState]] = js.undefined
}
object `191` {
  
  inline def apply[TState](): `191`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`191`[TState]]
  }
  
  extension [Self <: `191`[?], TState](x: Self & `191`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[PipelineBareFunction], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[PipelineBareFunction], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
