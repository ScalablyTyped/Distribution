package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.NumericLiteral
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `535`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[NumericLiteral, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[NumericLiteral, TState]] = js.native
}
object `535` {
  
  @scala.inline
  def apply[TState](): `535`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`535`[TState]]
  }
  
  @scala.inline
  implicit class `535MutableBuilder`[Self <: `535`[_], TState] (val x: Self with `535`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[NumericLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[NumericLiteral], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
