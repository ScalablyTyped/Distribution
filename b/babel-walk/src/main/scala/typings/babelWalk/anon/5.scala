package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSInterfaceBody
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInterfaceBody, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSInterfaceBody, TState]] = js.native
}
object `5` {
  
  @scala.inline
  def apply[TState](): `5`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[TState]]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`[_], TState] (val x: Self with `5`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSInterfaceBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSInterfaceBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
