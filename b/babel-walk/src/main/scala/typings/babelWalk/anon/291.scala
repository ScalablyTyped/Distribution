package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ReturnStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `291`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ReturnStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[ReturnStatement, TState]] = js.native
}
object `291` {
  
  @scala.inline
  def apply[TState](): `291`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`291`[TState]]
  }
  
  @scala.inline
  implicit class `291MutableBuilder`[Self <: `291`[_], TState] (val x: Self with `291`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ReturnStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ReturnStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
