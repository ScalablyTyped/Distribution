package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSCallSignatureDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `457`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSCallSignatureDeclaration, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSCallSignatureDeclaration, TState]] = js.undefined
}
object `457` {
  
  @scala.inline
  def apply[TState](): `457`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`457`[TState]]
  }
  
  @scala.inline
  implicit class `457MutableBuilder`[Self <: `457`[?], TState] (val x: Self & `457`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(
      value: (/* node */ NodeType[TSCallSignatureDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(
      value: (/* node */ NodeType[TSCallSignatureDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
