package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Directive
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `70`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Directive, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Directive, TState]] = js.native
}
object `70` {
  
  @scala.inline
  def apply[TState](): `70`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`70`[TState]]
  }
  
  @scala.inline
  implicit class `70MutableBuilder`[Self <: `70`[_], TState] (val x: Self with `70`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Directive], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Directive], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
