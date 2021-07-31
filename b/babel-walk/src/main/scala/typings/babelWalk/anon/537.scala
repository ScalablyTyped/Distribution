package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.DoExpression
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `537`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[DoExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[DoExpression, TState]] = js.undefined
}
object `537` {
  
  @scala.inline
  def apply[TState](): `537`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`537`[TState]]
  }
  
  @scala.inline
  implicit class `537MutableBuilder`[Self <: `537`[?], TState] (val x: Self & `537`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DoExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DoExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
