package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSStringKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `110`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSStringKeyword, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSStringKeyword, TState]] = js.native
}
object `110` {
  
  @scala.inline
  def apply[TState](): `110`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`110`[TState]]
  }
  
  @scala.inline
  implicit class `110MutableBuilder`[Self <: `110`[_], TState] (val x: Self with `110`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSStringKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSStringKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
