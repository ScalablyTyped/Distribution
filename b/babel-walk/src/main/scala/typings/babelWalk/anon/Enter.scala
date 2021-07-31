package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassExpression, TState]] = js.undefined
}
object Enter {
  
  @scala.inline
  def apply[TState](): Enter[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter[TState]]
  }
  
  @scala.inline
  implicit class EnterMutableBuilder[Self <: Enter[?], TState] (val x: Self & Enter[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
