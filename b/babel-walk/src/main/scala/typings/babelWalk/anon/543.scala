package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSBooleanKeyword
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `543`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSBooleanKeyword, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSBooleanKeyword, TState]] = js.native
}
object `543` {
  
  @scala.inline
  def apply[TState](): `543`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`543`[TState]]
  }
  
  @scala.inline
  implicit class `543MutableBuilder`[Self <: `543`[_], TState] (val x: Self with `543`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSBooleanKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSBooleanKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
