package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportSpecifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `124`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportSpecifier, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ImportSpecifier, TState]] = js.native
}
object `124` {
  
  @scala.inline
  def apply[TState](): `124`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`124`[TState]]
  }
  
  @scala.inline
  implicit class `124MutableBuilder`[Self <: `124`[_], TState] (val x: Self with `124`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ImportSpecifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ImportSpecifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
