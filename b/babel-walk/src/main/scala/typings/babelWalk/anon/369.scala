package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSTypeParameterInstantiation
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSTypeParameterInstantiation, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSTypeParameterInstantiation, TState]] = js.undefined
}
object `369` {
  
  @scala.inline
  def apply[TState](): `369`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`369`[TState]]
  }
  
  @scala.inline
  implicit class `369MutableBuilder`[Self <: `369`[?], TState] (val x: Self & `369`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(
      value: (/* node */ NodeType[TSTypeParameterInstantiation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(
      value: (/* node */ NodeType[TSTypeParameterInstantiation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
