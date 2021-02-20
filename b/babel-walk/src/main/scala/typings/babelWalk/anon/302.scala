package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSModuleDeclaration
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `302`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSModuleDeclaration, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TSModuleDeclaration, TState]] = js.native
}
object `302` {
  
  @scala.inline
  def apply[TState](): `302`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`302`[TState]]
  }
  
  @scala.inline
  implicit class `302MutableBuilder`[Self <: `302`[_], TState] (val x: Self with `302`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSModuleDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSModuleDeclaration], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
