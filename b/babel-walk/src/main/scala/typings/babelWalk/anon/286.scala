package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Loop
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `286`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Loop, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[Loop, TState]] = js.native
}
object `286` {
  
  @scala.inline
  def apply[TState](): `286`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`286`[TState]]
  }
  
  @scala.inline
  implicit class `286MutableBuilder`[Self <: `286`[_], TState] (val x: Self with `286`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Loop], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
