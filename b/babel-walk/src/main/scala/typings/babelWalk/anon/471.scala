package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.PipelineBareFunction
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `471`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[PipelineBareFunction, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[PipelineBareFunction, TState]] = js.undefined
}
object `471` {
  
  @scala.inline
  def apply[TState](): `471`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`471`[TState]]
  }
  
  @scala.inline
  implicit class `471MutableBuilder`[Self <: `471`[?], TState] (val x: Self & `471`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[PipelineBareFunction], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[PipelineBareFunction], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
