package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSArrayType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSArrayType, TState]] = js.undefined
}
object Exit {
  
  @scala.inline
  def apply[TState](): Exit[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exit[TState]]
  }
  
  @scala.inline
  implicit class ExitMutableBuilder[Self <: Exit[?], TState] (val x: Self & Exit[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSArrayType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
