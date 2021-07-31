package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DeclareFunction
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareFunction, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareFunction, TState]] = js.undefined
}
object `113` {
  
  @scala.inline
  def apply[TState](): `113`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`[TState]]
  }
  
  @scala.inline
  implicit class `113MutableBuilder`[Self <: `113`[?], TState] (val x: Self & `113`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DeclareFunction], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DeclareFunction], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
