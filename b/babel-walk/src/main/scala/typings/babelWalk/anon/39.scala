package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareModule
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `39`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareModule, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DeclareModule, TState]] = js.native
}
object `39` {
  
  @scala.inline
  def apply[TState](): `39`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`[TState]]
  }
  
  @scala.inline
  implicit class `39MutableBuilder`[Self <: `39`[_], TState] (val x: Self with `39`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareModule], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareModule], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
