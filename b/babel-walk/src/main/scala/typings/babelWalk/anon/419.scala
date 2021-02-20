package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSConstructSignatureDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `419`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSConstructSignatureDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSConstructSignatureDeclaration, TState]] = js.native
}
object `419` {
  
  @scala.inline
  def apply[TState](): `419`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`419`[TState]]
  }
  
  @scala.inline
  implicit class `419MutableBuilder`[Self <: `419`[_], TState] (val x: Self with `419`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(
      value: (/* node */ NodeType[TSConstructSignatureDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(
      value: (/* node */ NodeType[TSConstructSignatureDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
