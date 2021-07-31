package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.Conditional
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Conditional, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Conditional, TState]] = js.undefined
}
object `207` {
  
  @scala.inline
  def apply[TState](): `207`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`207`[TState]]
  }
  
  @scala.inline
  implicit class `207MutableBuilder`[Self <: `207`[?], TState] (val x: Self & `207`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Conditional], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Conditional], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
