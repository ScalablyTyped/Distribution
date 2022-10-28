package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PipelineTopicExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `419`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PipelineTopicExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PipelineTopicExpression, TState]] = js.undefined
}
object `419` {
  
  inline def apply[TState](): `419`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`419`[TState]]
  }
  
  extension [Self <: `419`[?], TState](x: Self & `419`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[PipelineTopicExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[PipelineTopicExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
