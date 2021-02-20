package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareVariable
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `208`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareVariable, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DeclareVariable, TState]] = js.native
}
object `208` {
  
  @scala.inline
  def apply[TState](): `208`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`208`[TState]]
  }
  
  @scala.inline
  implicit class `208MutableBuilder`[Self <: `208`[_], TState] (val x: Self with `208`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareVariable], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareVariable], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
