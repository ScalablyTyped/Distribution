package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.PatternLike
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[PatternLike, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[PatternLike, TState]] = js.undefined
}
object `114` {
  
  @scala.inline
  def apply[TState](): `114`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`114`[TState]]
  }
  
  @scala.inline
  implicit class `114MutableBuilder`[Self <: `114`[?], TState] (val x: Self & `114`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[PatternLike], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[PatternLike], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
