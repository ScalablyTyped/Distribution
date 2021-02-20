package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSIndexedAccessType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSIndexedAccessType, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSIndexedAccessType, TState]] = js.native
}
object `32` {
  
  @scala.inline
  def apply[TState](): `32`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`32`[TState]]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`[_], TState] (val x: Self with `32`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSIndexedAccessType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSIndexedAccessType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
