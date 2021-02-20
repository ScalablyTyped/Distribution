package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNumberKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `206`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNumberKeyword, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSNumberKeyword, TState]] = js.native
}
object `206` {
  
  @scala.inline
  def apply[TState](): `206`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`206`[TState]]
  }
  
  @scala.inline
  implicit class `206MutableBuilder`[Self <: `206`[_], TState] (val x: Self with `206`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSNumberKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSNumberKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
