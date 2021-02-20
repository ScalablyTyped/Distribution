package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.V8IntrinsicIdentifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `161`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[V8IntrinsicIdentifier, TState]] = js.native
}
object `161` {
  
  @scala.inline
  def apply[TState](): `161`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`161`[TState]]
  }
  
  @scala.inline
  implicit class `161MutableBuilder`[Self <: `161`[_], TState] (val x: Self with `161`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[V8IntrinsicIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
