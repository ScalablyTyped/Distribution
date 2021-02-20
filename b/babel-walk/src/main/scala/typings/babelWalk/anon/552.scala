package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ThisExpression
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `552`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ThisExpression, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ThisExpression, TState]] = js.native
}
object `552` {
  
  @scala.inline
  def apply[TState](): `552`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`552`[TState]]
  }
  
  @scala.inline
  implicit class `552MutableBuilder`[Self <: `552`[_], TState] (val x: Self with `552`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ThisExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ThisExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
