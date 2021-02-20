package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `274`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[FlowDeclaration, TState]] = js.native
}
object `274` {
  
  @scala.inline
  def apply[TState](): `274`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`274`[TState]]
  }
  
  @scala.inline
  implicit class `274MutableBuilder`[Self <: `274`[_], TState] (val x: Self with `274`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[FlowDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[FlowDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
