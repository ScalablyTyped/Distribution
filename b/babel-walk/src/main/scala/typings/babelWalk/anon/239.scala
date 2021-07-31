package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSIndexSignature
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `239`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSIndexSignature, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSIndexSignature, TState]] = js.undefined
}
object `239` {
  
  @scala.inline
  def apply[TState](): `239`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`239`[TState]]
  }
  
  @scala.inline
  implicit class `239MutableBuilder`[Self <: `239`[?], TState] (val x: Self & `239`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSIndexSignature], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSIndexSignature], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
