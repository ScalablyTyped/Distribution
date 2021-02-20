package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.IfStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `92`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.native
}
object `92` {
  
  @scala.inline
  def apply[TState](): `92`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`92`[TState]]
  }
  
  @scala.inline
  implicit class `92MutableBuilder`[Self <: `92`[_], TState] (val x: Self with `92`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[IfStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[IfStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
