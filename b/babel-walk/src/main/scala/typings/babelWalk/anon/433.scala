package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSEntityName
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `433`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSEntityName, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSEntityName, TState]] = js.native
}
object `433` {
  
  @scala.inline
  def apply[TState](): `433`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`433`[TState]]
  }
  
  @scala.inline
  implicit class `433MutableBuilder`[Self <: `433`[_], TState] (val x: Self with `433`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSEntityName], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSEntityName], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
