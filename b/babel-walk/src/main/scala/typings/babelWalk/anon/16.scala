package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForInStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ForInStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ForInStatement, TState]] = js.undefined
}
object `16` {
  
  @scala.inline
  def apply[TState](): `16`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[TState]]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`[?], TState] (val x: Self & `16`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ForInStatement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ForInStatement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
