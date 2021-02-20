package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeParameter
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `102`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeParameter, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSTypeParameter, TState]] = js.native
}
object `102` {
  
  @scala.inline
  def apply[TState](): `102`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`102`[TState]]
  }
  
  @scala.inline
  implicit class `102MutableBuilder`[Self <: `102`[_], TState] (val x: Self with `102`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSTypeParameter], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSTypeParameter], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
