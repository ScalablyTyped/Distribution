package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DirectiveLiteral
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `164`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DirectiveLiteral, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DirectiveLiteral, TState]] = js.native
}
object `164` {
  
  @scala.inline
  def apply[TState](): `164`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`164`[TState]]
  }
  
  @scala.inline
  implicit class `164MutableBuilder`[Self <: `164`[_], TState] (val x: Self with `164`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DirectiveLiteral], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DirectiveLiteral], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
