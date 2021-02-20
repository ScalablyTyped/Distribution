package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Import
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `195`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Import, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[Import, TState]] = js.native
}
object `195` {
  
  @scala.inline
  def apply[TState](): `195`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`195`[TState]]
  }
  
  @scala.inline
  implicit class `195MutableBuilder`[Self <: `195`[_], TState] (val x: Self with `195`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Import], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Import], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
