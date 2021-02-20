package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSUnknownKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `60`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSUnknownKeyword, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSUnknownKeyword, TState]] = js.native
}
object `60` {
  
  @scala.inline
  def apply[TState](): `60`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`[TState]]
  }
  
  @scala.inline
  implicit class `60MutableBuilder`[Self <: `60`[_], TState] (val x: Self with `60`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSUnknownKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSUnknownKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
