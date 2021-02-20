package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSEntityName
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `146`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSEntityName, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSEntityName, TState]] = js.native
}
object `146` {
  
  @scala.inline
  def apply[TState](): `146`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`146`[TState]]
  }
  
  @scala.inline
  implicit class `146MutableBuilder`[Self <: `146`[_], TState] (val x: Self with `146`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSEntityName], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSEntityName], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
