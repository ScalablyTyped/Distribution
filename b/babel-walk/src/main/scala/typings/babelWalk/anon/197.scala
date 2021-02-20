package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `197`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.native
}
object `197` {
  
  @scala.inline
  def apply[TState](): `197`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`197`[TState]]
  }
  
  @scala.inline
  implicit class `197MutableBuilder`[Self <: `197`[_], TState] (val x: Self with `197`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
