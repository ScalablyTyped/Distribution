package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportDeclaration
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `277`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ImportDeclaration, TState]] = js.native
}
object `277` {
  
  @scala.inline
  def apply[TState](): `277`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`277`[TState]]
  }
  
  @scala.inline
  implicit class `277MutableBuilder`[Self <: `277`[_], TState] (val x: Self with `277`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ImportDeclaration], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ImportDeclaration], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
