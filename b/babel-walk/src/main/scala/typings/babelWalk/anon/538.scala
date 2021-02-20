package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.JSXOpeningFragment
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `538`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXOpeningFragment, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[JSXOpeningFragment, TState]] = js.native
}
object `538` {
  
  @scala.inline
  def apply[TState](): `538`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`538`[TState]]
  }
  
  @scala.inline
  implicit class `538MutableBuilder`[Self <: `538`[_], TState] (val x: Self with `538`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXOpeningFragment], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXOpeningFragment], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
