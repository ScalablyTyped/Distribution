package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForOfStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForOfStatement, TState]] = js.undefined
}
object `188` {
  
  @scala.inline
  def apply[TState](): `188`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`188`[TState]]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`[?], TState] (val x: Self & `188`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ForOfStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
