package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXAttribute
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `111`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXAttribute, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[JSXAttribute, TState]] = js.native
}
object `111` {
  
  @scala.inline
  def apply[TState](): `111`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`111`[TState]]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`[_], TState] (val x: Self with `111`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXAttribute], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXAttribute], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
