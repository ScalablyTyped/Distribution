package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSQualifiedName
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `320`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSQualifiedName, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSQualifiedName, TState]] = js.native
}
object `320` {
  
  @scala.inline
  def apply[TState](): `320`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`320`[TState]]
  }
  
  @scala.inline
  implicit class `320MutableBuilder`[Self <: `320`[_], TState] (val x: Self with `320`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSQualifiedName], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSQualifiedName], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
