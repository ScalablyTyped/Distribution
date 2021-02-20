package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.OpaqueType
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `364`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[OpaqueType, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[OpaqueType, TState]] = js.native
}
object `364` {
  
  @scala.inline
  def apply[TState](): `364`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`364`[TState]]
  }
  
  @scala.inline
  implicit class `364MutableBuilder`[Self <: `364`[_], TState] (val x: Self with `364`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[OpaqueType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[OpaqueType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
