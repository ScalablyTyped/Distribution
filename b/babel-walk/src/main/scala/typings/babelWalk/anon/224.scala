package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TemplateElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `224`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TemplateElement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TemplateElement, TState]] = js.native
}
object `224` {
  
  @scala.inline
  def apply[TState](): `224`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`224`[TState]]
  }
  
  @scala.inline
  implicit class `224MutableBuilder`[Self <: `224`[_], TState] (val x: Self with `224`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TemplateElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TemplateElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
