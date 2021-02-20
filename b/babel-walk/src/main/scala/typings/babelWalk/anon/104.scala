package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.WithStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `104`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[WithStatement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[WithStatement, TState]] = js.native
}
object `104` {
  
  @scala.inline
  def apply[TState](): `104`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`104`[TState]]
  }
  
  @scala.inline
  implicit class `104MutableBuilder`[Self <: `104`[_], TState] (val x: Self with `104`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[WithStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[WithStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
