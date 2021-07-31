package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSNullKeyword
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNullKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNullKeyword, TState]] = js.undefined
}
object `37` {
  
  @scala.inline
  def apply[TState](): `37`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`37`[TState]]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`[?], TState] (val x: Self & `37`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSNullKeyword], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSNullKeyword], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
