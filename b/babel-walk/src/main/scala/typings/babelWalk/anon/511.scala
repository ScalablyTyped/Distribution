package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TemplateElement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `511`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TemplateElement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TemplateElement, TState]] = js.native
}
object `511` {
  
  @scala.inline
  def apply[TState](): `511`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`511`[TState]]
  }
  
  @scala.inline
  implicit class `511MutableBuilder`[Self <: `511`[_], TState] (val x: Self with `511`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TemplateElement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TemplateElement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
