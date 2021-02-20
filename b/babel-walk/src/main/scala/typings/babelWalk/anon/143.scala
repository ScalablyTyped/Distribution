package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSMappedType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `143`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSMappedType, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSMappedType, TState]] = js.native
}
object `143` {
  
  @scala.inline
  def apply[TState](): `143`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`143`[TState]]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`[_], TState] (val x: Self with `143`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSMappedType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSMappedType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
